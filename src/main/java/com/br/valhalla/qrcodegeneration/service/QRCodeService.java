package com.br.valhalla.qrcodegeneration.service;

import com.br.valhalla.qrcodegeneration.data.entity.AditionalDataFieldTemplate;
import com.br.valhalla.qrcodegeneration.data.entity.BRCode;
import com.br.valhalla.qrcodegeneration.data.entity.MerchantAccountInformationPix;
import com.br.valhalla.qrcodegeneration.data.vo.BRCodeVO;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;

@Service
public class QRCodeService {

    public static BufferedImage generateQRCodeImage(String barcodeText) throws Exception {
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix =
                barcodeWriter.encode(barcodeText, BarcodeFormat.QR_CODE, 200, 200);

        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }

    public static BufferedImage generateQRCodeImage(BRCodeVO brCodevo) throws Exception {

        MerchantAccountInformationPix merchantAccountInformationPix = new MerchantAccountInformationPix(brCodevo.getMerchantAccountInformationPixVO().getGloballyUniqueIdentifier().getValue(),
                brCodevo.getMerchantAccountInformationPixVO().getChavePix().getValue());

        AditionalDataFieldTemplate aditionalDataFieldTemplate = new AditionalDataFieldTemplate(brCodevo.getAditionalDataFieldTemplate().getReferenceLabel(),
                brCodevo.getAditionalDataFieldTemplate().getGloballyUniqueIdentifier(),
                brCodevo.getAditionalDataFieldTemplate().getVersaoBRCode());

        BRCode brCode = new BRCode(merchantAccountInformationPix,
                brCodevo.getMerchantCategoryCode(),
                brCodevo.getTransactionAmount(),
                brCodevo.getMerchantName(),
                brCodevo.getMerchantCity(),
                aditionalDataFieldTemplate,
                brCodevo.getCrc16());

        System.out.println(brCode.toString());

        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix =
                barcodeWriter.encode(brCode.toString(), BarcodeFormat.QR_CODE, 200, 200);

        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }
}

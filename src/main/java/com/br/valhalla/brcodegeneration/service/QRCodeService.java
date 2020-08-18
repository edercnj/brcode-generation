package com.br.valhalla.brcodegeneration.service;

import com.br.valhalla.brcodegeneration.data.entity.AditionalDataFieldTemplate;
import com.br.valhalla.brcodegeneration.data.entity.BRCode;
import com.br.valhalla.brcodegeneration.data.entity.MerchantAccountInformationPix;
import com.br.valhalla.brcodegeneration.data.vo.BRCodeVO;
import com.br.valhalla.brcodegeneration.log.annotation.LogException;
import com.br.valhalla.brcodegeneration.log.annotation.LogExecutionTime;

import com.br.valhalla.brcodegeneration.log.annotation.LogMethodCall;
import com.br.valhalla.brcodegeneration.log.annotation.LogMethodReturn;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;

@Service
public class QRCodeService {

    @LogException
    @LogMethodCall
    @LogMethodReturn
    @LogExecutionTime
    public static BufferedImage generateQRCodeImage(BRCodeVO brCodevo) throws WriterException {

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
        BitMatrix bitMatrix = barcodeWriter.encode(brCode.toString(), BarcodeFormat.QR_CODE, 250, 250);

        return MatrixToImageWriter.toBufferedImage(bitMatrix);

    }
}

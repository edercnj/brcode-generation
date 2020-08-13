package com.br.valhalla.qrcodegeneration.controller;

import com.br.valhalla.qrcodegeneration.data.Entity.BRCode;
import com.br.valhalla.qrcodegeneration.data.vo.BRCodeVO;
import com.br.valhalla.qrcodegeneration.service.QRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping("/qrCode")
public class QRCodeController {

    @Autowired
    private QRCodeService qrCodeService;

    @PostMapping(value = "/brcode/gerar", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> generateBRCode(@RequestBody BRCodeVO brCode) throws Exception {

        return ResponseEntity.ok(QRCodeService.generateQRCodeImage(brCode));
    }

    @Bean
    public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
        return new BufferedImageHttpMessageConverter();
    }
}

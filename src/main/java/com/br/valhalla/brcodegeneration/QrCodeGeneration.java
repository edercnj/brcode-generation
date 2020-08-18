package com.br.valhalla.brcodegeneration;

import com.br.valhalla.brcodegeneration.log.annotation.LogStartupApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class QrCodeGeneration {

	@LogStartupApplication
	public static void main(String[] args) {
		SpringApplication.run(QrCodeGeneration.class, args);
	}

}

package com.br.valhalla.brcodegeneration.log.exception;

public class ManagedException extends DomainException {
	public ManagedException(String debugMessage, String userMessage, int errorCod, String moreInfo) {
		super(debugMessage, userMessage, errorCod, moreInfo);
	}
}

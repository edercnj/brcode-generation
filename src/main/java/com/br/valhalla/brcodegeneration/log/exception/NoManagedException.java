package com.br.valhalla.brcodegeneration.log.exception;

public class NoManagedException extends DomainException {
    public NoManagedException(Exception e, String moreInfo) {
        super(e.getMessage(), "Internal Server Error", 1, moreInfo);
    }
}

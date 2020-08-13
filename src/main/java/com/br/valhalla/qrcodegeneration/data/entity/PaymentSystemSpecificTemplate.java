package com.br.valhalla.qrcodegeneration.data.entity;

public class PaymentSystemSpecificTemplate {

    private  final int id;
    private  final int length;
    private  final GloballyUniqueIdentifierPix globallyUniqueIdentifier;
    private  final VersaoBRCode versaoBRCode;

    public int getId() { return id; }

    public int getLength() { return length; }

    public GloballyUniqueIdentifierPix getGloballyUniqueIdentifier() { return globallyUniqueIdentifier; }

    public VersaoBRCode getVersaoBRCode() { return versaoBRCode; }

    public PaymentSystemSpecificTemplate(String  gui, String versaoBRCode) {
        this.id = 50;
        this.globallyUniqueIdentifier = new GloballyUniqueIdentifierPix(gui);
        this.versaoBRCode = new VersaoBRCode(versaoBRCode);
        this.length = getGloballyUniqueIdentifier().toString().length() + this.getVersaoBRCode().toString().length();
    }

    @Override
    public String toString() {
        return String.format("%02d", this.id) + String.format("%02d", this.length) + globallyUniqueIdentifier.toString() + versaoBRCode.toString();
    }
}

package com.br.valhalla.qrcodegeneration.data.entity;

public class MerchantAccountInformationPix {

    private final int id;
    private final int length;
    private final GloballyUniqueIdentifierPix globallyUniqueIdentifier;
    private final ChavePix chavePix;

    public int getId() { return id; }
    public int getLength() { return length; }
    public GloballyUniqueIdentifierPix getGloballyUniqueIdentifier() { return globallyUniqueIdentifier; }
    public ChavePix getChavePix() { return chavePix; }

    public MerchantAccountInformationPix(String gui, String chavePix) {
        this.id = 26;
        this.globallyUniqueIdentifier = new GloballyUniqueIdentifierPix(gui);
        this.chavePix = new ChavePix("01", chavePix);
        this.length = getGloballyUniqueIdentifier().toString().length() + getChavePix().toString().length();
    }

    @Override
    public String toString() {
        return String.format("%02d", getId())  // TAG
                + String.format("%02d", getLength())
                + getGloballyUniqueIdentifier().toString() + getChavePix().toString(); // VALUE
    }

    public boolean isValid() {
        return globallyUniqueIdentifier.isValid() && chavePix.isValid();
    }
}
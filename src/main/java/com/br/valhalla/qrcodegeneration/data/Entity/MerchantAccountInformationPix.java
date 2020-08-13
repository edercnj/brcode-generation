package com.br.valhalla.qrcodegeneration.data.Entity;

public class MerchantAccountInformationPix {

    private final int id = 26;
    private int length;
    private DataObject globallyUniqueIdentifier;
    private DataObject chavePix;

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public DataObject getGloballyUniqueIdentifier() {
        return globallyUniqueIdentifier;
    }

    public void setGloballyUniqueIdentifier(DataObject globallyUniqueIdentifier) {
        this.globallyUniqueIdentifier = globallyUniqueIdentifier;
    }

    public DataObject getChavePix() {
        return chavePix;
    }

    public void setChavePix(DataObject chavePix) {
        this.chavePix = chavePix;
    }

    public MerchantAccountInformationPix(String gui, String chavePix) {
        this.globallyUniqueIdentifier = new DataObject("00", gui);
        this.chavePix = new DataObject("01", chavePix);
        this.length = getGloballyUniqueIdentifier().toString().length() + getChavePix().toString().length();
    }

    @Override
    public String toString() {
        return String.format("%02d", getId())  // TAG
                + String.format("%02d", getLength())
                + getGloballyUniqueIdentifier().toString() + getChavePix().toString(); // VALUE
    }
}
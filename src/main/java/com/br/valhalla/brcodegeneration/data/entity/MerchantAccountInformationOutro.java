package com.br.valhalla.brcodegeneration.data.entity;

public class MerchantAccountInformationOutro {

    private final int id;
    private final int length;
    private final GloballyUniqueIdentifierOutro globallyUniqueIdentifier;
    private final Identificador identificador;

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public GloballyUniqueIdentifierOutro getGloballyUniqueIdentifier() {
        return globallyUniqueIdentifier;
    }

    public Identificador getIdentificador() {
        return identificador;
    }


    public MerchantAccountInformationOutro(int id, String gui, String identificador) {
        this.id = id;
        this.globallyUniqueIdentifier = new GloballyUniqueIdentifierOutro(gui);
        this.identificador = new Identificador("01", identificador);
        this.length = getGloballyUniqueIdentifier().toString().length() + getIdentificador().toString().length();
    }

    @Override
    public String toString() {
        return String.format("%02d", getId())  // TAG
                + String.format("%02d", getLength())
                + getGloballyUniqueIdentifier().toString() + getIdentificador().toString(); // VALUE
    }
}

package com.br.valhalla.qrcodegeneration.data.Entity;

public class MerchantAccountInformationOutro {

    private int id;
    private int length;
    private DataObject globallyUniqueIdentifier;
    private DataObject Identificador;

    public void setId(int id) { this.id = id; }

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

    public DataObject getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(DataObject identificador) {
        Identificador = identificador;
    }

    public MerchantAccountInformationOutro(int id, String gui, String identificador) {
        this.id = id;
        this.globallyUniqueIdentifier = new DataObject("00", gui);
        Identificador = new DataObject("01", identificador);
        this.length = getGloballyUniqueIdentifier().toString().length() + getIdentificador().toString().length();
    }

    @Override
    public String toString() {
        return String.format("%02d", getId())  // TAG
                + String.format("%02d", getLength())
                + getGloballyUniqueIdentifier().toString() + getIdentificador().toString(); // VALUE
    }
}

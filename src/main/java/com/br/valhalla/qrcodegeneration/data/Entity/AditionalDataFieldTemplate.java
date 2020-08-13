package com.br.valhalla.qrcodegeneration.data.Entity;

public class AditionalDataFieldTemplate {

    private final int id = 62;
    private int length;

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private DataObject referenceLabel = new DataObject("05");

    public DataObject getReferenceLabel() {
        return referenceLabel;
    }

    public void setReferenceLabel(DataObject referenceLabel) {
        this.referenceLabel = referenceLabel;
    }

    public AditionalDataFieldTemplate(String referenceLabel) {
        this.referenceLabel.setValue(referenceLabel);
        this.length = this.referenceLabel.toString().length();
    }

    @Override
    public String toString() {
        return String.format("%02d", this.id) + String.format("%02d", this.length) + this.referenceLabel.toString();
    }
}

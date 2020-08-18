package com.br.valhalla.brcodegeneration.data.entity;

public class PointOfInitiationMethod extends DataObject {
    public PointOfInitiationMethod(String value) {
        super("01", 2, value);
    }

    public boolean isValid() {
        return (getLength() == 2);
    }
}

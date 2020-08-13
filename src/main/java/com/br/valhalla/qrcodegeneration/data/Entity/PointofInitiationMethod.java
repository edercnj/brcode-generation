package com.br.valhalla.qrcodegeneration.data.Entity;

public class PointofInitiationMethod extends DataObject {
    public PointofInitiationMethod(String value) {
        super("01", 2, value);
    }

    public boolean isValid() {
        return (getLength() == 2);
    }
}

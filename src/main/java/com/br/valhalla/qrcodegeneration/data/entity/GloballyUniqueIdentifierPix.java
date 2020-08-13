package com.br.valhalla.qrcodegeneration.data.entity;

public class GloballyUniqueIdentifierPix extends DataObject{
    public GloballyUniqueIdentifierPix(String value) {
        super("00", 14, value);
    }

    public boolean isValid()
    {
        return getValue().length() == 14;
    }
}

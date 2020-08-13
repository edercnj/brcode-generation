package com.br.valhalla.qrcodegeneration.data.entity;

public class GloballyUniqueIdentifierOutro extends DataObject{
    public GloballyUniqueIdentifierOutro( String value) {
        super("00", value.length(), value);
    }

    public boolean isValid()
    {
        return !getValue().equals("");
    }
}

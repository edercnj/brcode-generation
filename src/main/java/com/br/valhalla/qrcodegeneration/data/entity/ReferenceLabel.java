package com.br.valhalla.qrcodegeneration.data.entity;

public class ReferenceLabel extends DataObject{
    public ReferenceLabel(String value) {
        super("05",value.length(), value);
    }
    public boolean isValid(){
        return getLength() <= 25;
    }
}

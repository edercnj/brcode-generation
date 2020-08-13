package com.br.valhalla.qrcodegeneration.data.entity;

public class ChavePix extends DataObject {

    public ChavePix(String tag, String value) {
        super(tag, value.length(), value);
    }

    public boolean isValid()
    {
        //valor 00 reservado para gui
        return !getValue().equals("00");
    }
}

package com.br.valhalla.brcodegeneration.data.entity;

public class Identificador extends DataObject {

    public Identificador(String tag, String value) {
        super(tag, value.length(), value);
    }

    public boolean isValid()
    {
        //valor 00 reservado para gui
        return !getValue().equals("00");
    }
}

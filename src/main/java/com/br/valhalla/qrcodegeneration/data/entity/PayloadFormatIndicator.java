package com.br.valhalla.qrcodegeneration.data.entity;

public class PayloadFormatIndicator extends DataObject {
    public PayloadFormatIndicator() {
        super("00", 2, "01");
    }

    public boolean isValid() {
        return (getValue().equals("01") && getLength() == 4 && getTag().equals("00"));
    }
}

package com.br.valhalla.brcodegeneration.data.entity;

public class MerchantName extends DataObject {
    public MerchantName(String value) {
        super("59", value);
    }

    public boolean isValid() {
        return (!getValue().equals("") && getLength() <= 25);
    }
}

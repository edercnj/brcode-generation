package com.br.valhalla.qrcodegeneration.data.Entity;

public class MerchantName extends DataObject {
    public MerchantName(String value) {
        super("59", value);
    }

    public boolean isValid() {
        return (!getValue().equals("") && getLength() <= 25);
    }
}

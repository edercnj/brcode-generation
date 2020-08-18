package com.br.valhalla.brcodegeneration.data.entity;

public class MerchantCategoryCode extends DataObject {

    public MerchantCategoryCode(String value) {
        super("52", 4, value);
    }

    public MerchantCategoryCode() {
        super("52", 4, "0000");
    }

    public boolean isValid() {
        return (getLength() == 4 && !getValue().equals(""));
    }

    private boolean mccIsNumber()
    {
        return true;
    }
}

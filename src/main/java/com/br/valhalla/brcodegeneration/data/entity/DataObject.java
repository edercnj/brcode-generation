package com.br.valhalla.brcodegeneration.data.entity;

public class DataObject {

    private String tag;
    private int length;
    private String value;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return tag + String.format("%02d", getValue().length()) + value;
    }

    public DataObject(String tag, int length, String value) {
        this.tag = tag;
        this.length = length;
        this.value = value;
    }

    public DataObject(String tag, int length) {
        this.tag = tag;
        this.length = length;
    }

    public DataObject(String tag, String value) {
        this.tag = tag;
        this.value = value;
        this.length = value.length();
    }

    public DataObject(String tag) {
        this.tag = tag;
    }
}

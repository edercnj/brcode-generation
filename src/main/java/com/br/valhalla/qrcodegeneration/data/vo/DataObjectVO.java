package com.br.valhalla.qrcodegeneration.data.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class DataObjectVO {

    private String tag;
    private int length;
    @NotNull
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

    public DataObjectVO(String tag, int length, String value) {
        this.tag = tag;
        this.length = length;
        this.value = value;
    }

    public DataObjectVO(String tag, int length) {
        this.tag = tag;
        this.length = length;
    }

    public DataObjectVO(String tag, String value) {
        this.tag = tag;
        this.value = value;
        this.length = value.length();
    }

    public DataObjectVO(String tag) {
        this.tag = tag;
    }

    public DataObjectVO() {}

}

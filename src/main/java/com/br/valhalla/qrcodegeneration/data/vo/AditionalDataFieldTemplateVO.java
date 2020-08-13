package com.br.valhalla.qrcodegeneration.data.vo;

import com.br.valhalla.qrcodegeneration.data.Entity.DataObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class AditionalDataFieldTemplateVO {

    private int id = 62;
    private int length;
    @NotNull
    private DataObjectVO referenceLabel = new DataObjectVO("05");

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DataObjectVO getReferenceLabel() {
        return referenceLabel;
    }

    public void setReferenceLabel(DataObjectVO referenceLabel) {
        this.referenceLabel = referenceLabel;
    }

}

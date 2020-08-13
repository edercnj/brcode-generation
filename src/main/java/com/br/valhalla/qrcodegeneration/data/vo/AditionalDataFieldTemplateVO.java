package com.br.valhalla.qrcodegeneration.data.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class AditionalDataFieldTemplateVO {

    private int id = 62;
    private int length;
    @NotNull
    String referenceLabel;
    @NotNull
    String versaoBRCode;
    @NotNull
    String globallyUniqueIdentifier;

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

    public String getReferenceLabel() {
        return referenceLabel;
    }

    public void setReferenceLabel(String referenceLabel) {
        this.referenceLabel = referenceLabel;
    }

    public String getVersaoBRCode() {
        return versaoBRCode;
    }

    public void setVersaoBRCode(String versaoBRCode) {
        this.versaoBRCode = versaoBRCode;
    }

    public String getGloballyUniqueIdentifier() {
        return globallyUniqueIdentifier;
    }

    public void setGloballyUniqueIdentifier(String globallyUniqueIdentifier) {
        this.globallyUniqueIdentifier = globallyUniqueIdentifier;
    }
}

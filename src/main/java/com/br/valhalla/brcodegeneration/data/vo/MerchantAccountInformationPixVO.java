package com.br.valhalla.brcodegeneration.data.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties (ignoreUnknown = true)
@JsonInclude (JsonInclude.Include.NON_NULL)
public class MerchantAccountInformationPixVO {

    private final int id = 26;
    private int length;
    @NotNull
    private DataObjectVO globallyUniqueIdentifier;
    @NotNull
    private DataObjectVO chavePix;

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public DataObjectVO getGloballyUniqueIdentifier() {
        return globallyUniqueIdentifier;
    }

    public void setGloballyUniqueIdentifier(DataObjectVO globallyUniqueIdentifier) {
        this.globallyUniqueIdentifier = globallyUniqueIdentifier;
    }

    public DataObjectVO getChavePix() {
        return chavePix;
    }

    public void setChavePix(DataObjectVO chavePix) {
        this.chavePix = chavePix;
    }

}
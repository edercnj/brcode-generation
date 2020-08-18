package com.br.valhalla.brcodegeneration.data.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class MerchantAccountInformationOutroVO {

    @NotNull
    private int id;
    private int length;
    @NotNull
    private DataObjectVO globallyUniqueIdentifier;
    @NotNull
    private DataObjectVO Identificador;

    public void setId(int id) { this.id = id; }

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

    public DataObjectVO getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(DataObjectVO identificador) {
        Identificador = identificador;
    }

}

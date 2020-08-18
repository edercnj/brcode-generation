package com.br.valhalla.brcodegeneration.data.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class BRCodeVO {

    private String pointofInitiationMethod;
    private MerchantAccountInformationCartoesVO merchantAccountInformationCartoesVO;
    @NotNull
    private MerchantAccountInformationPixVO merchantAccountInformationPixVO;
    private MerchantAccountInformationOutroVO merchantAccountInformationOutroVO;
    @NotNull
    private String merchantCategoryCode;
    @NotNull
    private float transactionAmount;
    @NotNull
    private String merchantName;
    @NotNull
    private String merchantCity;
    private String postalCode;
    @NotNull
    private AditionalDataFieldTemplateVO aditionalDataFieldTemplate;
    private UnreservedTemplatesVO unreservedTemplates;
    @NotNull
    private String crc16;

    public String getPointofInitiationMethod() {
        return pointofInitiationMethod;
    }

    public void setPointofInitiationMethod(String pointofInitiationMethod) {
        this.pointofInitiationMethod = pointofInitiationMethod;
    }

    public MerchantAccountInformationPixVO getMerchantAccountInformationPixVO() {
        return merchantAccountInformationPixVO;
    }

    public void setMerchantAccountInformationPixVO(MerchantAccountInformationPixVO merchantAccountInformationPixVO) {
        this.merchantAccountInformationPixVO = merchantAccountInformationPixVO;
    }

    public MerchantAccountInformationOutroVO getMerchantAccountInformationOutroVO() {
        return merchantAccountInformationOutroVO;
    }

    public void setMerchantAccountInformationOutroVO(MerchantAccountInformationOutroVO merchantAccountInformationOutroVO) {
        this.merchantAccountInformationOutroVO = merchantAccountInformationOutroVO;
    }

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public float getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public UnreservedTemplatesVO getUnreservedTemplates() {
        return unreservedTemplates;
    }

    public void setUnreservedTemplates(UnreservedTemplatesVO unreservedTemplates) {
        this.unreservedTemplates = unreservedTemplates;
    }

    public AditionalDataFieldTemplateVO getAditionalDataFieldTemplate() {
        return aditionalDataFieldTemplate;
    }

    public void setAditionalDataFieldTemplate(AditionalDataFieldTemplateVO aditionalDataFieldTemplate) {
        this.aditionalDataFieldTemplate = aditionalDataFieldTemplate;
    }

    public String getCrc16() {
        return crc16;
    }

    public void setCrc16(String crc16) {
        this.crc16 = crc16;
    }

    public MerchantAccountInformationCartoesVO getMerchantAccountInformationCartoesVO() {
        return merchantAccountInformationCartoesVO;
    }

    public void setMerchantAccountInformationCartoesVO(MerchantAccountInformationCartoesVO merchantAccountInformationCartoesVO) {
        this.merchantAccountInformationCartoesVO = merchantAccountInformationCartoesVO;
    }
}

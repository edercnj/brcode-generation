package com.br.valhalla.brcodegeneration.data.entity;

public class BRCode {

    private final PayloadFormatIndicator payloadFormatIndicator;
    private PointOfInitiationMethod pointofInitiationMethod;
    private MerchantAccountInformationCartoes merchantAccountInformationCartoes;
    private final MerchantAccountInformationPix merchantAccountInformationPix;
    private MerchantAccountInformationOutro merchantAccountInformationOutro;
    private final MerchantCategoryCode merchantCategoryCode;
    private TransactionCurrency transactionCurrency;
    private final TransactionAmount transactionAmount;
    private CountryCode countryCode;
    private MerchantName merchantName;
    private MerchantCity merchantCity;
    private PostalCode postalCode;
    private final AditionalDataFieldTemplate aditionalDataFieldTemplate;
    private UnreservedTemplates unreservedTemplates;
    private final DataObject crc16;


    public DataObject getPayloadFormatIndicator() {return payloadFormatIndicator; }

    public DataObject getPointOfInitiationMethod() {return pointofInitiationMethod; }

    public MerchantAccountInformationCartoes getMerchantAccountInformationCartoes() { return merchantAccountInformationCartoes; }

    public MerchantAccountInformationPix getMerchantAccountInformationPix() { return merchantAccountInformationPix; }

    public MerchantAccountInformationOutro getMerchantAccountInformationOutro() { return merchantAccountInformationOutro; }

    public DataObject getMerchantCategoryCode() { return merchantCategoryCode; }

    public DataObject getTransactionCurrency() { return transactionCurrency; }

    public DataObject getTransactionAmount() { return transactionAmount; }

    public DataObject getCountryCode() { return countryCode; }

    public DataObject getMerchantName() { return merchantName; }

    public DataObject getMerchantCity() { return merchantCity; }

    public DataObject getPostalCode() { return postalCode; }

    public AditionalDataFieldTemplate getAditionalDataFieldTemplate() { return this.aditionalDataFieldTemplate; }

    public UnreservedTemplates getUnreservedTemplates() { return unreservedTemplates; }

    public void setMerchantAccountInformationCartoes(MerchantAccountInformationCartoes merchantAccountInformationCartoes) { this.merchantAccountInformationCartoes = merchantAccountInformationCartoes; }

    public DataObject getCrc16() { return crc16; }


    public BRCode(MerchantAccountInformationPix merchantAccountInformationPix, String merchantCategoryCode, float transactionAmount,
                  String merchantName, String merchantCity, AditionalDataFieldTemplate aditionalDataFieldTemplate, String crc16) {
        this.payloadFormatIndicator = new PayloadFormatIndicator();
        this.merchantAccountInformationPix = merchantAccountInformationPix;
        this.merchantCategoryCode = new MerchantCategoryCode(merchantCategoryCode);
        this.transactionAmount = new TransactionAmount(String.valueOf(transactionAmount));
        this.transactionCurrency = new TransactionCurrency();
        this.countryCode = new CountryCode();
        this.merchantName = new MerchantName(merchantName);
        this.merchantCity = new MerchantCity(merchantCity);
        this.aditionalDataFieldTemplate = aditionalDataFieldTemplate;
        this.crc16 = new CRC16(crc16);

    }

    public BRCode(String pointOfInitiationMethod, MerchantAccountInformationCartoes merchantAccountInformationCartoes, MerchantAccountInformationOutro merchantAccountInformationOutro,
                  MerchantAccountInformationPix merchantAccountInformationPix, String merchantCategoryCode, float transactionAmount,
                  String merchantName, String merchantCity, String postalCode, AditionalDataFieldTemplate aditionalDataFieldTemplate, UnreservedTemplates unreservedTemplates, String crc16) {
        this.payloadFormatIndicator = new PayloadFormatIndicator();
        this.pointofInitiationMethod = new PointOfInitiationMethod(pointOfInitiationMethod);
        this.merchantAccountInformationCartoes = merchantAccountInformationCartoes;
        this.merchantAccountInformationOutro = merchantAccountInformationOutro;
        this.merchantAccountInformationPix = merchantAccountInformationPix;
        this.merchantCategoryCode = new MerchantCategoryCode(merchantCategoryCode);
        this.transactionAmount = new TransactionAmount(String.valueOf(transactionAmount));
        this.merchantName = new MerchantName(merchantName);
        this.merchantCity = new MerchantCity(merchantCity);
        this.merchantName = new MerchantName(merchantName);
        this.merchantCity = new MerchantCity(merchantCity);
        this.postalCode = new PostalCode(postalCode);
        this.aditionalDataFieldTemplate = aditionalDataFieldTemplate;
        this.unreservedTemplates = unreservedTemplates;
        this.crc16 = new CRC16(crc16);
    }

    public String toJson() {
        return "BRCode{" +
                "payloadFormatIndicator:" + getPayloadFormatIndicator() +
                ", pointOfInitiationMethod:" + getPointOfInitiationMethod() +
                ", merchantAccountInformationCartoes:" + getMerchantAccountInformationCartoes() +
                ", merchantAccountInformationPix:" + getMerchantAccountInformationPix() +
                ", merchantAccountInformationOutro:" + getMerchantAccountInformationOutro() +
                ", merchantCategoryCode:" + getMerchantCategoryCode() +
                ", transactionCurrency:" + getTransactionCurrency() +
                ", transactionAmount:" + getTransactionAmount() +
                ", countryCode:" + getCountryCode() +
                ", merchantName:" + getMerchantName() +
                ", merchantCity:" + getMerchantCity() +
                ", postalCode:" + getPostalCode() +
                ", aditionalDataFieldTemplate:" + getAditionalDataFieldTemplate() +
                ", unreservedTemplates:" + getUnreservedTemplates() +
                ", crc16:" + getCrc16() +
                '}';
    }

    @Override
    public String toString() {
        return getPayloadFormatIndicator().toString() +
                (getPointOfInitiationMethod() == null || getPointOfInitiationMethod().getValue() == null ? "" : getPointOfInitiationMethod().toString()) +
                (getMerchantAccountInformationCartoes() == null ? "" : getMerchantAccountInformationCartoes().toString()) +
                (getMerchantAccountInformationPix() == null ? "" : getMerchantAccountInformationPix().toString()) +
                (getMerchantAccountInformationOutro() == null ? "" : getMerchantAccountInformationOutro().toString()) +
                (getMerchantCategoryCode() == null ? "" : getMerchantCategoryCode().toString()) +
                (getTransactionCurrency() == null ? "" : getTransactionCurrency().toString()) +
                (getTransactionAmount() == null ? "" : getTransactionAmount().toString()) +
                (getCountryCode() == null ? "" : getCountryCode().toString()) +
                (getMerchantName() == null ? "" : getMerchantName().toString()) +
                (getMerchantCity() == null ? "" : getMerchantCity().toString()) +
                (getPostalCode() == null || getPostalCode().getValue() == null ? "" : getPostalCode().toString()) +
                (getAditionalDataFieldTemplate() == null ? "" : getAditionalDataFieldTemplate().toString()) +
                (getUnreservedTemplates() == null ? "" : getUnreservedTemplates().toString()) +
                (getCrc16() == null ? "" : getCrc16().toString());
    }

    public boolean isValid() {
        return true;
    }
}

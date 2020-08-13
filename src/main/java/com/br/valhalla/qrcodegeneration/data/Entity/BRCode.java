package com.br.valhalla.qrcodegeneration.data.Entity;

public class BRCode {

    private PayloadFormatIndicator payloadFormatIndicator;
    private PointofInitiationMethod pointofInitiationMethod;
    private MerchantAccountInformationPix merchantAccountInformationPix;
    private MerchantAccountInformationOutro merchantAccountInformationOutro;
    private MerchantCategoryCode merchantCategoryCode;
    private TransactionCurrency transactionCurrency;
    private TransactionAmount transactionAmount;
    private CountryCode countryCode;
    private MerchantName merchantName;
    private MerchantCity merchantCity;
    private PostalCode postalCode;
    private AditionalDataFieldTemplate AditionalDataFieldTemplate;
    private UnreservedTemplates unreservedTemplates;
    private DataObject crc16;

    public DataObject getPayloadFormatIndicator() {return payloadFormatIndicator; }

    public DataObject getPointofInitiationMethod() {return pointofInitiationMethod; }

    public MerchantAccountInformationPix getMerchantAccountInformationPix() { return merchantAccountInformationPix; }

    public MerchantAccountInformationOutro getMerchantAccountInformationOutro() { return merchantAccountInformationOutro; }

    public DataObject getMerchantCategoryCode() { return merchantCategoryCode; }

    public DataObject getTransactionCurrency() { return transactionCurrency; }

    public DataObject getTransactionAmount() { return transactionAmount; }

    public DataObject getCountryCode() { return countryCode; }

    public DataObject getMerchantName() { return merchantName; }

    public DataObject getMerchantCity() { return merchantCity; }

    public DataObject getPostalCode() { return postalCode; }

    public AditionalDataFieldTemplate getAditionalDataFieldTemplate() { return AditionalDataFieldTemplate; }

    public UnreservedTemplates getUnreservedTemplates() { return unreservedTemplates; }

    public DataObject getCrc16() { return crc16; }

    public BRCode(MerchantAccountInformationPix merchantAccountInformationPix, String merchantCategoryCode, float transactionAmount,
                  String merchantName, String merchantCity, AditionalDataFieldTemplate aditionalDataFieldTemplate, String crc16) {
        this.payloadFormatIndicator = new PayloadFormatIndicator();
        this.merchantAccountInformationPix = merchantAccountInformationPix;
        this.merchantCategoryCode = new MerchantCategoryCode();
        this.transactionAmount = new TransactionAmount(String.valueOf(transactionAmount));
        this.merchantName = new MerchantName(merchantName);
        this.merchantCity = new MerchantCity(merchantCity);
        AditionalDataFieldTemplate = aditionalDataFieldTemplate;
        this.crc16 = new CRC16(crc16);

    }

    public BRCode(String pointofInitiationMethod, MerchantAccountInformationOutro merchantAccountInformationOutro, MerchantAccountInformationPix merchantAccountInformationPix, String merchantCategoryCode, float transactionAmount,
                  String merchantName, String merchantCity, String postalCode, AditionalDataFieldTemplate aditionalDataFieldTemplate, UnreservedTemplates unreservedTemplates, String crc16) {
        this.payloadFormatIndicator = new PayloadFormatIndicator();
        this.pointofInitiationMethod = new PointofInitiationMethod(pointofInitiationMethod);
        this.merchantAccountInformationOutro = merchantAccountInformationOutro;
        this.merchantAccountInformationPix = merchantAccountInformationPix;
        this.merchantCategoryCode = new MerchantCategoryCode(merchantCategoryCode);
        this.transactionAmount = new TransactionAmount(String.valueOf(transactionAmount));
        this.merchantName = new MerchantName(merchantName);
        this.merchantCity = new MerchantCity(merchantCity);
        this.postalCode = new PostalCode(postalCode);
        AditionalDataFieldTemplate = aditionalDataFieldTemplate;
        this.unreservedTemplates = unreservedTemplates;
        this.crc16 = new CRC16(crc16);
    }

    public String toJson() {
        return "{" +
                "payloadFormatIndicator:" + payloadFormatIndicator +
                ", pointofInitiationMethod:" + pointofInitiationMethod +
                ", merchantAccountInformationPix:" + merchantAccountInformationPix +
                ", merchantAccountInformationOutro:" + merchantAccountInformationOutro +
                ", merchantCategoryCode:" + merchantCategoryCode +
                ", transactionCurrency:" + transactionCurrency +
                ", transactionAmount:" + transactionAmount +
                ", countryCode:" + countryCode +
                ", merchantName:" + merchantName +
                ", merchantCity:" + merchantCity +
                ", postalCode:" + postalCode +
                ", AditionalDataFieldTemplate:" + AditionalDataFieldTemplate +
                ", unreservedTemplates:" + unreservedTemplates +
                ", crc16:" + crc16 +
                ", aditionalDataFieldTemplate:" + getAditionalDataFieldTemplate() +
                '}';
    }

    @Override
    public String toString() {
        return payloadFormatIndicator.toString() +
                (pointofInitiationMethod == null || pointofInitiationMethod.getValue() == null ? "" : pointofInitiationMethod.toString()) +
                (merchantAccountInformationPix == null ? "" : merchantAccountInformationPix.toString()) +
                (merchantAccountInformationOutro == null ? "" : merchantAccountInformationOutro.toString()) +
                (merchantCategoryCode == null ? "" : merchantCategoryCode.toString()) +
                (transactionCurrency == null ? "" : transactionCurrency.toString()) +
                (transactionAmount == null ? "" : transactionAmount.toString()) +
                (countryCode == null ? "" : countryCode.toString()) +
                (merchantName == null ? "" : merchantName.toString()) +
                (merchantCity == null ? "" : merchantCity.toString()) +
                (postalCode == null || postalCode.getValue() == null ? "" : postalCode.toString()) +
                (AditionalDataFieldTemplate == null ? "" : AditionalDataFieldTemplate.toString()) +
                (unreservedTemplates == null ? "" : unreservedTemplates.toString()) +
                (crc16 == null ? "" : crc16.toString());
    }

    public boolean isValid() {
        return true;
    }
}

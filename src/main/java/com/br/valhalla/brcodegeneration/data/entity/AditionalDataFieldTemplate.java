package com.br.valhalla.brcodegeneration.data.entity;

public class AditionalDataFieldTemplate {

    private final int id;
    private int length;
    private final ReferenceLabel referenceLabel;
    private final PaymentSystemSpecificTemplate paymentSystemSpecificTemplate;

    public int getId() {
        return id;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public ReferenceLabel getReferenceLabel() {
        return referenceLabel;
    }
    public PaymentSystemSpecificTemplate getPaymentSystemSpecificTemplate() { return paymentSystemSpecificTemplate; }

    public AditionalDataFieldTemplate(String referenceLabel, String gui, String  versaoBRCode) {
        this.id = 62;
        this.referenceLabel = new ReferenceLabel(referenceLabel);
        this.paymentSystemSpecificTemplate = new PaymentSystemSpecificTemplate(gui, versaoBRCode);
        this.length = this.referenceLabel.toString().length() + this.paymentSystemSpecificTemplate.toString().length();
    }

    @Override
    public String toString() {
        return String.format("%02d", this.id) + String.format("%02d", this.length) + this.referenceLabel.toString() + paymentSystemSpecificTemplate.toString();
    }
}

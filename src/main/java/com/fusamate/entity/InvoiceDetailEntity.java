package com.fusamate.entity;

import java.math.BigInteger;

public class InvoiceDetailEntity {
    private int invoicedetailId;
    private String image ,  name, variant;
    private BigInteger quantity;
    private double listedPrice, subPrice;
    private int invoiceId;

    public InvoiceDetailEntity() {
    }

    public InvoiceDetailEntity(int invoicedetailId, String image, String name, String variant, BigInteger quantity, double listedPrice, double subPrice, int invoiceId) {
        this.invoicedetailId = invoicedetailId;
        this.image = image;
        this.name = name;
        this.variant = variant;
        this.quantity = quantity;
        this.listedPrice = listedPrice;
        this.subPrice = subPrice;
        this.invoiceId = invoiceId;
    }

    public int getInvoicedetailId() {
        return invoicedetailId;
    }

    public void setInvoicedetailId(int invoicedetailId) {
        this.invoicedetailId = invoicedetailId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public double getListedPrice() {
        return listedPrice;
    }

    public void setListedPrice(double listedPrice) {
        this.listedPrice = listedPrice;
    }

    public double getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(double subPrice) {
        this.subPrice = subPrice;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }
}

package com.fusamate.entity;

import java.util.Date;

public class InvoiceEntity {
    private int invoiceId;
    private Date createdAt;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String ward;
    private String district;
    private String province;
    private int shipType;
    private boolean paymentType;
    private double voucher;
    private double totalPrice;
    private double shipCost;
    private double totalPayment;
    private int status;
    private String note;
    private Date updatedAt;
    private String updatedBy;

    public InvoiceEntity() {
    }

    public InvoiceEntity(int invoiceId, Date createdAt, String name, String email, String phone, String address, String ward, String district, String province, int shipType, boolean paymentType, double voucher, double totalPrice, double shipCost, double totalPayment, int status, String note, Date updatedAt, String updatedBy) {
        this.invoiceId = invoiceId;
        this.createdAt = createdAt;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.ward = ward;
        this.district = district;
        this.province = province;
        this.shipType = shipType;
        this.paymentType = paymentType;
        this.voucher = voucher;
        this.totalPrice = totalPrice;
        this.shipCost = shipCost;
        this.totalPayment = totalPayment;
        this.status = status;
        this.note = note;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getShipType() {
        return shipType;
    }

    public void setShipType(int shipType) {
        this.shipType = shipType;
    }

    public boolean isPaymentType() {
        return paymentType;
    }

    public void setPaymentType(boolean paymentType) {
        this.paymentType = paymentType;
    }

    public double getVoucher() {
        return voucher;
    }

    public void setVoucher(double voucher) {
        this.voucher = voucher;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getShipCost() {
        return shipCost;
    }

    public void setShipCost(double shipCost) {
        this.shipCost = shipCost;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}

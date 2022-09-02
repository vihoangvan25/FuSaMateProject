package com.fusamate.entity;

public class CustomerInfoEntity {
    private int customerinfoId;
    private String name;
    private String address;
    private String ward;
    private String district;
    private String province;
    private String phone;
    private boolean defaultCustomerInfo;
    private int customerId;

    public CustomerInfoEntity(int customerinfoId) {
        this.customerinfoId = customerinfoId;
    }

    public CustomerInfoEntity(int customerinfoId, String name, String address, String ward, String district, String province, String phone, boolean defaultCustomerInfo, int customerId) {
        this.customerinfoId = customerinfoId;
        this.name = name;
        this.address = address;
        this.ward = ward;
        this.district = district;
        this.province = province;
        this.phone = phone;
        this.defaultCustomerInfo = defaultCustomerInfo;
        this.customerId = customerId;
    }

    public int getCustomerinfoId() {
        return customerinfoId;
    }

    public void setCustomerinfoId(int customerinfoId) {
        this.customerinfoId = customerinfoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isDefaultCustomerInfo() {
        return defaultCustomerInfo;
    }

    public void setDefaultCustomerInfo(boolean defaultCustomerInfo) {
        this.defaultCustomerInfo = defaultCustomerInfo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}

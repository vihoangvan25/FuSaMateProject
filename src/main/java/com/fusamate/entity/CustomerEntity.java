package com.fusamate.entity;

import java.util.Date;

public class CustomerEntity {
    private int customerId;
    private String passsword;
    private String email;
    private String name;
    private String phone;
    private boolean gender;
    private Date birthDay;
    private float height;
    private float weight;
    private boolean status;
    private Date createdAt;
    private Date updatedAt;
    private String updatedBy;

    public CustomerEntity(int customerId) {
        this.customerId = customerId;
    }

    public CustomerEntity(int customerId, String passsword, String email, String name, String phone, boolean gender, Date birthDay, float height, float weight, boolean status, Date createdAt, Date updatedAt, String updatedBy) {
        this.customerId = customerId;
        this.passsword = passsword;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.birthDay = birthDay;
        this.height = height;
        this.weight = weight;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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

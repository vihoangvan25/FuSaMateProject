package com.fusamate.entity;

import java.math.BigInteger;
import java.util.Date;

public class ComboSet {
    private int combosetID;
    private String name;
    private boolean status;
    private boolean gender;
    private String description;
    private BigInteger totalAmount;
    private Date createdAt;
    private Date updatedAt;
    private String updatedBy;
    private boolean active;
    private int brandID;
    private int categoryID;

    public ComboSet(int combosetID) {
        this.combosetID = combosetID;
    }

    public ComboSet(int combosetID, String name, boolean status, boolean gender, String description, BigInteger totalAmount, Date createdAt, Date updatedAt, String updatedBy, boolean active, int brandID, int categoryID) {
        this.combosetID = combosetID;
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.description = description;
        this.totalAmount = totalAmount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.active = active;
        this.brandID = brandID;
        this.categoryID = categoryID;
    }

    public int getCombosetID() {
        return combosetID;
    }

    public void setCombosetID(int combosetID) {
        this.combosetID = combosetID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigInteger totalAmount) {
        this.totalAmount = totalAmount;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}

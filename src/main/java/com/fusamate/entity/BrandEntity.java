package com.fusamate.entity;

import java.util.Date;

public class BrandEntity {
    private int brandId;
    private String name;
    private boolean status;
    private Date createdAt;
    private Date updatedAt;
    private String updatedBy;
    private int productSetID;

    public BrandEntity() {
    }

    public BrandEntity(int brandId, String name, boolean status, Date createdAt, Date updatedAt, String updatedBy, int productSetID) {
        this.brandId = brandId;
        this.name = name;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.productSetID = productSetID;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
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

    public int getProductSetID() {
        return productSetID;
    }

    public void setProductSetID(int productSetID) {
        this.productSetID = productSetID;
    }
}

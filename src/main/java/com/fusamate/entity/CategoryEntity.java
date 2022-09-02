package com.fusamate.entity;

import java.util.Date;

public class CategoryEntity {
    private int categoryId;
    private String name;
    private boolean status;
    private Date createdAt;
    private Date updatedAt;
    private String updatedBy;
    private int productSetID;

    public CategoryEntity(int categoryId) {
        this.categoryId = categoryId;
    }

    public CategoryEntity(int categoryId, String name, boolean status, Date createdAt, Date updatedAt, String updatedBy, int productSetID) {
        this.categoryId = categoryId;
        this.name = name;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.productSetID = productSetID;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

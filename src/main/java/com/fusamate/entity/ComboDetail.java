package com.fusamate.entity;

public class ComboDetail {
    private int combodetailId;
    private String image;
    private int productdetailId;
    private int comboId;

    public ComboDetail(int combodetailId) {
        this.combodetailId = combodetailId;
    }

    public ComboDetail(int combodetailId, String image, int productdetailId, int comboId) {
        this.combodetailId = combodetailId;
        this.image = image;
        this.productdetailId = productdetailId;
        this.comboId = comboId;
    }

    public int getCombodetailId() {
        return combodetailId;
    }

    public void setCombodetailId(int combodetailId) {
        this.combodetailId = combodetailId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getProductdetailId() {
        return productdetailId;
    }

    public void setProductdetailId(int productdetailId) {
        this.productdetailId = productdetailId;
    }

    public int getComboId() {
        return comboId;
    }

    public void setComboId(int comboId) {
        this.comboId = comboId;
    }
}

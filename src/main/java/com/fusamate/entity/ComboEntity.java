package com.fusamate.entity;

import java.math.BigInteger;

public class ComboEntity {
    private int comboID;
    private String name;
    private BigInteger availAmount;
    private double origin_price;
    private int combosetID;

    public ComboEntity(int comboID) {
        this.comboID = comboID;
    }

    public ComboEntity(int comboID, String name, BigInteger availAmount, double origin_price, int combosetID) {
        this.comboID = comboID;
        this.name = name;
        this.availAmount = availAmount;
        this.origin_price = origin_price;
        this.combosetID = combosetID;
    }

    public int getComboID() {
        return comboID;
    }

    public void setComboID(int comboID) {
        this.comboID = comboID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getAvailAmount() {
        return availAmount;
    }

    public void setAvailAmount(BigInteger availAmount) {
        this.availAmount = availAmount;
    }

    public double getOrigin_price() {
        return origin_price;
    }

    public void setOrigin_price(double origin_price) {
        this.origin_price = origin_price;
    }

    public int getCombosetID() {
        return combosetID;
    }

    public void setCombosetID(int combosetID) {
        this.combosetID = combosetID;
    }
}

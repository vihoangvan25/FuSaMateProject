package com.fusamate.entity;

import java.util.Date;

public class EmployeeEntity {
    private int employeeID;
    private String username;
    private String passsword;
    private String name;
    private boolean gender;
    private Date birthDay;
    private String phone;
    private String identityCard;
    private boolean role;
    private String note;
    private boolean status;
    private String email;
    private String images;
    private Date createdAt;
    private Date updatedAt;
    private String updatedBy;

    public EmployeeEntity(int employeeID) {
        this.employeeID = employeeID;
    }

    public EmployeeEntity(int employeeID, String username, String passsword, String name, boolean gender, Date birthDay, String phone, String identityCard, boolean role, String note, boolean status, String email, String images, Date createdAt, Date updatedAt, String updatedBy) {
        this.employeeID = employeeID;
        this.username = username;
        this.passsword = passsword;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.phone = phone;
        this.identityCard = identityCard;
        this.role = role;
        this.note = note;
        this.status = status;
        this.email = email;
        this.images = images;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
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

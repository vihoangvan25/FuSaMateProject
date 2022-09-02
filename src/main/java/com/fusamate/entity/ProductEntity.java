package com.fusamate.entity;

import java.math.BigInteger;
import java.util.Date;

public class ProductEntity {
    private int productId;
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
}

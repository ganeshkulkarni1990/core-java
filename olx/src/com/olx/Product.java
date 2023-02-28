package com.olx;

public class Product {
    private long id;
    private String productName;

    public void setId(long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public double getPrize() {
        return prize;
    }

    public String getMake() {
        return make;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    private ProductCategory productCategory;
    private double prize;
    private String make;

    private String extraInfo;
}

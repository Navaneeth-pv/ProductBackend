package com.example.ProductBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue()

    private int id;
    private String productCode;
    private String productName;
    private String manDate;
    private String expDate;
    private String brand;
    private String price;
    private String sellerName;
    private String distrinutorName;

    public Products() {
    }

    public Products(int id, String productCode, String productName, String manDate, String expDate, String brand, String price, String sellerName, String distrinutorName) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.manDate = manDate;
        this.expDate = expDate;
        this.brand = brand;
        this.price = price;
        this.sellerName = sellerName;
        this.distrinutorName = distrinutorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManDate() {
        return manDate;
    }

    public void setManDate(String manDate) {
        this.manDate = manDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDistrinutorName() {
        return distrinutorName;
    }

    public void setDistrinutorName(String distrinutorName) {
        this.distrinutorName = distrinutorName;
    }
}

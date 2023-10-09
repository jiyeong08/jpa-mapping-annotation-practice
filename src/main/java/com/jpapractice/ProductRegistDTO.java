package com.jpapractice;

import java.time.LocalDate;

public class ProductRegistDTO {

    private String productName;
    private String manufacturer;
    private int price;
    private LocalDate releaseDate;
    private double screenSize;
    private OperatingSys operatingSys;
    private int battery;

    public ProductRegistDTO() {
    }

    public ProductRegistDTO(String productName, String manufacturer, int price, LocalDate releaseDate, double screenSize, OperatingSys operatingSys, int battery) {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.releaseDate = releaseDate;
        this.screenSize = screenSize;
        this.operatingSys = operatingSys;
        this.battery = battery;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public OperatingSys getOperatingSys() {
        return operatingSys;
    }

    public void setOperatingSys(OperatingSys operatingSys) {
        this.operatingSys = operatingSys;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "ProductRegistDTO{" +
                "productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", screenSize=" + screenSize +
                ", operatingSys=" + operatingSys +
                ", battery=" + battery +
                '}';
    }
}

package com.jpapractice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "phone")
public class Product {

    @Id
    @Column(name = "PRODUCT_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productNo;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name = "PRICE")
    private int price;

    @Column(name = "RELEASE_DATE")
    private LocalDate releaseDate;

    @Column(name = "SCREEN_SIZE")
    private double screenSize;

    @Column(name = "OPERATING_SYS")
    @Enumerated(EnumType.STRING)
    private OperatingSys operatingSys;

    @Column(name = "BATTERY")
    private int battery;

    public Product() {
    }

    public Product(String productName, String manufacturer, int price, LocalDate releaseDate, double screenSize, OperatingSys operatingSys, int battery) {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.releaseDate = releaseDate;
        this.screenSize = screenSize;
        this.operatingSys = operatingSys;
        this.battery = battery;
    }
}

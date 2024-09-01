package com.travelltrip.transporthub.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long shipmentId;
    @Column
    private String shipmentDate;
    @Column
    private String address;
    @Column
    private  String city;
    @Column
    private  String state;
    @Column
    private  String country;
    @Column
    private  int zipCode;
    @OneToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    public Shipment() {
    }

    public Shipment(Long shipmentId, String shipmentDate, String address, String city, String state, String country, int zipCode, Customer customer) {
        this.shipmentId = shipmentId;
        this.shipmentDate = shipmentDate;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.customer = customer;
    }

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

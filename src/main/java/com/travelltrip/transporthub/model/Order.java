package com.travelltrip.transporthub.model;

import jakarta.persistence.*;

@Entity
@Table
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long orderId;
    @Column
    private  String orderDate;
    @Column
    private int totalPrice;
    @OneToOne
    @JoinColumn(name = "customerID")
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "paymentID")
    private Payment payment;
    @OneToOne
    @JoinColumn(name = "shipmentID")
    private Shipment shipment;

    public Order() {
    }

    public Order(Long orderId, String orderDate, int totalPrice, Customer customer, Payment payment, Shipment shipment) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.payment = payment;
        this.shipment = shipment;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}

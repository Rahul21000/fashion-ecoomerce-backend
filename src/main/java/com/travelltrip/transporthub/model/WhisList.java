package com.travelltrip.transporthub.model;

import jakarta.persistence.*;

@Entity
@Table(name = "whislist")
public class WhisList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long whislistId;
    @OneToOne
    @JoinColumn(name = "customerID")
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "productID")
    private Product product;

    public WhisList() {
    }

    public WhisList(Long whislistId, Customer customer, Product product) {
        this.whislistId = whislistId;
        this.customer = customer;
        this.product = product;
    }

    public Long getWhislistId() {
        return whislistId;
    }

    public void setWhislistId(Long whislistId) {
        this.whislistId = whislistId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

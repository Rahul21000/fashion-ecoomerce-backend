package com.travelltrip.transporthub.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long cartId;
    @Column
    private  String quantity;
    @OneToOne
    @JoinColumn(name = "customerID")
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;
}

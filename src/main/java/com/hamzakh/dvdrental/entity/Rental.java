package com.hamzakh.dvdrental.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "rental")
public class Rental {
    @Id
    @Column(name = "rental_id")
    private int rentalId;

    @Column(name = "inventory_id")
    private int inventoryId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "rental_date")
    private Timestamp rentalDate;

    @Column(name = "return_date")
    private Timestamp returnDate;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @ManyToOne
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    private Customer customer;

    @OneToMany
    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    private List<Address> addresses;

    @ManyToOne
    @JoinColumn(name = "inventory_id", insertable = false, updatable = false)
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name = "staff_id", insertable = false, updatable = false)
    private Staff staff;

    @OneToMany
    @JoinColumn(name = "store_id", insertable = false, updatable = false)
    private List<Store> store;
}
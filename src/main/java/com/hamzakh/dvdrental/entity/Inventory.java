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
@Table(name = "inventory")
public class Inventory {
    @Id
    @Column(name = "inventory_id")
    private int inventoryId;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @ManyToOne
    @JoinColumn(name = "film_id", insertable = false, updatable = false)
    private Film film;

    @ManyToOne
    @JoinColumn(name = "store_id", insertable = false, updatable = false)
    private Store store;

    @OneToMany
    @JoinColumn(name = "rental_id", insertable = false, updatable = false)
    private List<Rental> rental;
}
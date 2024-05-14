package com.hamzakh.dvdrental.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "store")
public class Store {
    @Id
    @Column(name = "store_id")
    private int storeId;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Column(name = "manager_staff_id")
    private int managerStaffId;

    @Column(name = "address_id")
    private int addressId;

    @OneToOne
    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    private Address address;
}
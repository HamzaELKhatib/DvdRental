package com.hamzakh.dvdrental.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity(name = "Address")
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
    private int addressId;

    @Column(name = "address")
    private String address;

    @Column(name = "address2")
    private String address2;

    @Column(name = "district")
    private String district;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "phone")
    private String phone;

    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @OneToMany
    @JoinColumn(name = "city_id", insertable = false, updatable = false)
    private List<City> cities;
}
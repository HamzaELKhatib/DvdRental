package com.hamzakh.dvdrental.entity.view;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "staff_list")
public class StaffList {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "address", length = 50)
    private String address;

    @Column(name = "\"zip code\"", length = 10)
    private String zipCode;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "sid")
    private Short sid;

}
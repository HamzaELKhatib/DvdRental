package com.hamzakh.dvdrental.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.type.descriptor.jdbc.SmallIntJdbcType;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "city_id")
    private int cityId;

    @Column(name = "city")
    private String city;

    @Column(name = "last_update")
    private Timestamp lastUpdate;
}
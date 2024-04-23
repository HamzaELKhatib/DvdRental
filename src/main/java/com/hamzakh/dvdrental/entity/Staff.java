package com.hamzakh.dvdrental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "staff")
public class Staff {
    @Id
    @Column(name = "staff_id")
    private int staffId;

    @Column(name = "last_update")
    private Timestamp lastUpdate;
}
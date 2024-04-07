package com.hamzakh.dvdrental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "category")
public class Category {
    @Id
    private int categoryId;
    private String name;
    private Timestamp lastUpdate;
}
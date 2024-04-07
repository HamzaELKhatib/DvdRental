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
@Table(name = "film_category")
public class FilmCategory {
    @Id
    private int filmId;
    private int categoryId;
    private Timestamp lastUpdate;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;
}

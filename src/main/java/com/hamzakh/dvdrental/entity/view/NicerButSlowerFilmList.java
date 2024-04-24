package com.hamzakh.dvdrental.entity.view;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "nicer_but_slower_film_list")
public class NicerButSlowerFilmList {
    @Id
    @Column(name = "fid")
    private Integer fid;

    @Column(name = "title")
    private String title;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "category", length = 25)
    private String category;

    @Column(name = "price", precision = 4, scale = 2)
    private BigDecimal price;

    @Column(name = "length")
    private Short length;

    @Column(name = "rating", columnDefinition = "mpaa_rating")
    private Object rating;

    @Column(name = "actors", length = Integer.MAX_VALUE)
    private String actors;

}
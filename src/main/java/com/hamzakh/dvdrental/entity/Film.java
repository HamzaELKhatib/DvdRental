package com.hamzakh.dvdrental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "film")
public class Film {
    @Id
    @Column(name = "film_id")
    private int filmId;

    @Column(name = "title")
    private String title;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "release_year", columnDefinition = "year")
    private int releaseYear;

    @Column(name = "rental_duration")
    private int rentalDuration;

    @Column(name = "rental_rate", columnDefinition = "numeric")
    private double rentalRate;

    @Column(name = "length", columnDefinition = "smallint")
    private Short length;

    @Column(name = "replacement_cost", columnDefinition = "numeric")
    private double replacementCost;

    @Column(name = "rating", columnDefinition = "mpaa_rating")
    private String rating;

    @Column(name = "special_features", columnDefinition = "set('Trailers','Commentaries','Deleted Scenes','Behind the Scenes')")
    private String specialFeatures;

    @Column(name = "fulltext", columnDefinition = "tsvector")
    private String fulltext;

    @Column(name = "language_id")
    private int languageId;
}
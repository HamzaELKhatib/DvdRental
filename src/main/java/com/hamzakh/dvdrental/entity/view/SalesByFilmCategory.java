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
@Table(name = "sales_by_film_category")
public class SalesByFilmCategory {
    @Id
    @Column(name = "category", length = 25)
    private String category;

    @Column(name = "total_sales")
    private BigDecimal totalSales;

}
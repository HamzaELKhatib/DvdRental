package com.hamzakh.dvdrental.repository;

import com.hamzakh.dvdrental.entity.Rental;
import com.hamzakh.dvdrental.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {
}

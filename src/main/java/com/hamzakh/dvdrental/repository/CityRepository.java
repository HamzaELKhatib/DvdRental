package com.hamzakh.dvdrental.repository;

import com.hamzakh.dvdrental.entity.City;
import com.hamzakh.dvdrental.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}

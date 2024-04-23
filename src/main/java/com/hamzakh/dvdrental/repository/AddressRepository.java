package com.hamzakh.dvdrental.repository;

import com.hamzakh.dvdrental.entity.Address;
import com.hamzakh.dvdrental.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}

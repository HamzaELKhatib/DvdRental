package com.hamzakh.dvdrental.repository;

import com.hamzakh.dvdrental.entity.Customer;
import com.hamzakh.dvdrental.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

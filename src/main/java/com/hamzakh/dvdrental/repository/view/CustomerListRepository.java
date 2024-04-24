package com.hamzakh.dvdrental.repository.view;

import com.hamzakh.dvdrental.entity.view.CustomerList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerListRepository extends JpaRepository<CustomerList, Integer> {
}
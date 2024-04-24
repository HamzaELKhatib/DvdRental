package com.hamzakh.dvdrental.repository.view;

import com.hamzakh.dvdrental.entity.view.SalesByStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesByStoreRepository extends JpaRepository<SalesByStore, String> {
}
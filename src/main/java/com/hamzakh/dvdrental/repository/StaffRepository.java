package com.hamzakh.dvdrental.repository;

import com.hamzakh.dvdrental.entity.Staff;
import com.hamzakh.dvdrental.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
}

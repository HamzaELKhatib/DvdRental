package com.hamzakh.dvdrental.repository;

import com.hamzakh.dvdrental.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
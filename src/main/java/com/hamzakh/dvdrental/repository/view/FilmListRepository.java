package com.hamzakh.dvdrental.repository.view;

import com.hamzakh.dvdrental.entity.view.FilmList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmListRepository extends JpaRepository<FilmList, Integer> {
}
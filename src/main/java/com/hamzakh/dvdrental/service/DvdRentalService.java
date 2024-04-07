package com.hamzakh.dvdrental.service;

import com.hamzakh.dvdrental.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DvdRentalService {

    @Autowired
    CategoryRepository categoryRepository;


    public String getWelcomeMessage() {
        var t = categoryRepository.findAll();
        return String.valueOf(t.size());
    }
}

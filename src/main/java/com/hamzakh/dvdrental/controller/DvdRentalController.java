package com.hamzakh.dvdrental.controller;

import com.hamzakh.dvdrental.service.DvdRentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DvdRentalController {

    @Autowired
    DvdRentalService dvdRentalService;

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return dvdRentalService.getWelcomeMessage();
    }
}

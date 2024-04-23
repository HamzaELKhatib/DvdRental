package com.hamzakh.dvdrental.controller;

import com.hamzakh.dvdrental.service.DvdRentalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DvdRentalController {

    final DvdRentalService dvdRentalService;

    public DvdRentalController(DvdRentalService dvdRentalService) {
        this.dvdRentalService = dvdRentalService;
    }

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return dvdRentalService.getWelcomeMessage();
    }
}

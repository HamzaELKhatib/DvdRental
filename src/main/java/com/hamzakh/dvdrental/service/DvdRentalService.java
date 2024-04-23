package com.hamzakh.dvdrental.service;

import com.hamzakh.dvdrental.entity.*;
import com.hamzakh.dvdrental.repository.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DvdRentalService {

    final CountryRepository categoryRepository;

    final PaymentRepository paymentRepository;

    final FilmRepository filmRepository;

    final AddressRepository addressRepository;

    final CityRepository cityRepository;

    final CustomerRepository customerRepository;

    final InventoryRepository inventoryRepository;

    final RentalRepository rentalRepository;

    final StaffRepository staffRepository;

    final StoreRepository storeRepository;

    public DvdRentalService(CountryRepository categoryRepository,
                            PaymentRepository paymentRepository,
                            FilmRepository filmRepository,
                            AddressRepository addressRepository,
                            CityRepository cityRepository,
                            CustomerRepository customerRepository,
                            InventoryRepository inventoryRepository,
                            RentalRepository rentalRepository,
                            StaffRepository staffRepository,
                            StoreRepository storeRepository) {
        this.categoryRepository = categoryRepository;
        this.paymentRepository = paymentRepository;
        this.filmRepository = filmRepository;
        this.addressRepository = addressRepository;
        this.cityRepository = cityRepository;
        this.customerRepository = customerRepository;
        this.inventoryRepository = inventoryRepository;
        this.rentalRepository = rentalRepository;
        this.staffRepository = staffRepository;
        this.storeRepository = storeRepository;

    }

    private List<Country> getCountries() {
        return Optional.of(categoryRepository.findAll()).orElseThrow();
    }

    private List<Payment> getPayments() {
        return Optional.of(paymentRepository.findAll()).orElseThrow();
    }

    private List<Film> getFilms() {
        return Optional.of(filmRepository.findAll()).orElseThrow();
    }

    private List<Address> getAddresses() {
        return Optional.of(addressRepository.findAll()).orElseThrow();
    }

    private List<City> getCities() {
        return Optional.of(cityRepository.findAll()).orElseThrow();
    }

    private List<Customer> getCustomers() {
        return Optional.of(customerRepository.findAll()).orElseThrow();
    }

    private List<Inventory> getInventories() {
        return Optional.of(inventoryRepository.findAll()).orElseThrow();
    }

    private List<Rental> getRentals() {
        return Optional.of(rentalRepository.findAll()).orElseThrow();
    }

    private List<Staff> getStaffs() {
        return Optional.of(staffRepository.findAll()).orElseThrow();
    }

    private List<Store> getStores() {
        return Optional.of(storeRepository.findAll()).orElseThrow();
    }

    public String getWelcomeMessage() {
        List<Country> countries = this.getCountries();
        List<Payment> payments = this.getPayments();
        List<Film> films = this.getFilms();
        List<Address> addresses = this.getAddresses();
        List<City> cities = this.getCities();
        List<Customer> customers = this.getCustomers();
        List<Inventory> inventories = this.getInventories();
        List<Rental> rentals = this.getRentals();
        List<Staff> staffs = this.getStaffs();
        List<Store> stores = this.getStores();

        return String.valueOf(this.getCountries().size());
    }
}

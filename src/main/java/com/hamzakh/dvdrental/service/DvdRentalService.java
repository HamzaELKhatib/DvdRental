package com.hamzakh.dvdrental.service;

import com.hamzakh.dvdrental.entity.*;
import com.hamzakh.dvdrental.repository.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

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
        Optional<List<Country>> countryList = Optional.of(categoryRepository.findAll());
        return countryList.orElseThrow();
    }

    private List<Payment> getPayments() {
        Optional<List<Payment>> paymentList = Optional.of(paymentRepository.findAll());
        return paymentList.orElseThrow();
    }

    private List<Film> getFilms() {
        Optional<List<Film>> filmList = Optional.of(filmRepository.findAll());
        return filmList.orElseThrow();
    }

    private List<Address> getAddresses() {
        Optional<List<Address>> addressList = Optional.of(addressRepository.findAll());
        return addressList.orElseThrow();
    }

    private List<City> getCities() {
        Optional<List<City>> cityList = Optional.of(cityRepository.findAll());
        return cityList.orElseThrow();
    }

    private List<Customer> getCustomers() {
        Optional<List<Customer>> customerList = Optional.of(customerRepository.findAll());
        return customerList.orElseThrow();
    }

    private List<Inventory> getInventories() {
        Optional<List<Inventory>> inventoryList = Optional.of(inventoryRepository.findAll());
        return inventoryList.orElseThrow();
    }

    private List<Rental> getRentals() {
        Optional<List<Rental>> rentalList = Optional.of(rentalRepository.findAll());
        return rentalList.orElseThrow();
    }

    private List<Staff> getStaffs() {
        Optional<List<Staff>> staffList = Optional.of(staffRepository.findAll());
        return staffList.orElseThrow();
    }

    private List<Store> getStores() {
        Optional<List<Store>> storeList = Optional.of(storeRepository.findAll());
        return storeList.orElseThrow();
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

package com.hamzakh.dvdrental.service;

import com.hamzakh.dvdrental.entity.*;
import com.hamzakh.dvdrental.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.sql.Timestamp;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Slf4j
@Service
public class DvdRentalService {

    Logger logger = Logger.getLogger(DvdRentalService.class.getName());

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
        StopWatch stopWatch = new StopWatch();

        stopWatch.start("countries");
        List<Country> countries = this.getCountries();
        stopWatch.stop();

        stopWatch.start("payments");
        List<Payment> payments = this.getPayments();
        stopWatch.stop();

        stopWatch.start("films");
        List<Film> films = this.getFilms();
        stopWatch.stop();

        stopWatch.start("addresses");
        List<Address> addresses = this.getAddresses();
        stopWatch.stop();

        stopWatch.start("cities");
        List<City> cities = this.getCities();
        stopWatch.stop();

        stopWatch.start("customers");
        List<Customer> customers = this.getCustomers();
        stopWatch.stop();

        stopWatch.start("inventories");
        List<Inventory> inventories = this.getInventories();
        stopWatch.stop();

        stopWatch.start("rentals");
        List<Rental> rentals = this.getRentals();
        stopWatch.stop();

        stopWatch.start("staffs");
        List<Staff> staffs = this.getStaffs();
        stopWatch.stop();

        stopWatch.start("stores");
        List<Store> stores = this.getStores();
        stopWatch.stop();

        logger.info("Data retrieved successfully! Time taken: " + stopWatch.prettyPrint());

        return String.valueOf(this.getCountries().size());
    }
}

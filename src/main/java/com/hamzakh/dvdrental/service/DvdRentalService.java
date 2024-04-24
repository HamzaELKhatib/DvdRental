package com.hamzakh.dvdrental.service;

import com.hamzakh.dvdrental.entity.*;
import com.hamzakh.dvdrental.entity.view.*;
import com.hamzakh.dvdrental.repository.*;
import com.hamzakh.dvdrental.repository.view.*;
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

    final FilmListRepository filmListRepository;

    final ActorInfoRepository actorInfoRepository;

    final CustomerListRepository customerListRepository;

    final NicerButSlowerFilmListRepository nicerButSlowerFilmListRepository;

    final SalesByFilmCategoryRepository salesByFilmCategoryRepository;

    final SalesByStoreRepository salesByStoreRepository;

    final StaffListRepository staffListRepository;

    public DvdRentalService(CountryRepository categoryRepository,
                            PaymentRepository paymentRepository,
                            FilmRepository filmRepository,
                            AddressRepository addressRepository,
                            CityRepository cityRepository,
                            CustomerRepository customerRepository,
                            InventoryRepository inventoryRepository,
                            RentalRepository rentalRepository,
                            StaffRepository staffRepository,
                            StoreRepository storeRepository,
                            FilmListRepository filmListRepository,
                            ActorInfoRepository actorInfoRepository,
                            CustomerListRepository customerListRepository,
                            NicerButSlowerFilmListRepository nicerButSlowerFilmListRepository,
                            SalesByFilmCategoryRepository salesByFilmCategoryRepository,
                            SalesByStoreRepository salesByStoreRepository,
                            StaffListRepository staffListRepository) {
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
        this.filmListRepository = filmListRepository;
        this.actorInfoRepository = actorInfoRepository;
        this.customerListRepository = customerListRepository;
        this.nicerButSlowerFilmListRepository = nicerButSlowerFilmListRepository;
        this.salesByFilmCategoryRepository = salesByFilmCategoryRepository;
        this.salesByStoreRepository = salesByStoreRepository;
        this.staffListRepository = staffListRepository;
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

    private List<FilmList> getFilmList() {
        return Optional.of(filmListRepository.findAll()).orElseThrow();
    }

    private List<ActorInfo> getActorInfo() {
        return Optional.of(actorInfoRepository.findAll()).orElseThrow();
    }

    private List<CustomerList> getCustomerList() {
        return Optional.of(customerListRepository.findAll()).orElseThrow();
    }

    private List<NicerButSlowerFilmList> getNicerButSlowerFilmList() {
        return Optional.of(nicerButSlowerFilmListRepository.findAll()).orElseThrow();
    }

    private List<SalesByFilmCategory> getSalesByFilmCategory() {
        return Optional.of(salesByFilmCategoryRepository.findAll()).orElseThrow();
    }

    private List<SalesByStore> getSalesByStore() {
        return Optional.of(salesByStoreRepository.findAll()).orElseThrow();
    }

    private List<StaffList> getStaffList() {
        return Optional.of(staffListRepository.findAll()).orElseThrow();
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

        stopWatch.start("filmLists");
        List<FilmList> filmLists = this.getFilmList();
        stopWatch.stop();

        stopWatch.start("actorInfo");
        List<ActorInfo> actorInfo = this.getActorInfo();
        stopWatch.stop();

        stopWatch.start("customerList");
        List<CustomerList> customerList = this.getCustomerList();
        stopWatch.stop();

        stopWatch.start("nicerButSlowerFilmList");
        List<NicerButSlowerFilmList> nicerButSlowerFilmList = this.getNicerButSlowerFilmList();
        stopWatch.stop();

        stopWatch.start("salesByFilmCategory");
        List<SalesByFilmCategory> salesByFilmCategory = this.getSalesByFilmCategory();
        stopWatch.stop();

        stopWatch.start("salesByStore");
        List<SalesByStore> salesByStore = this.getSalesByStore();
        stopWatch.stop();

        stopWatch.start("staffList");
        List<StaffList> staffList = this.getStaffList();
        stopWatch.stop();

        logger.info("Data retrieved successfully! Time taken: " + stopWatch.prettyPrint());

        return String.valueOf(this.getCountries().size());
    }
}

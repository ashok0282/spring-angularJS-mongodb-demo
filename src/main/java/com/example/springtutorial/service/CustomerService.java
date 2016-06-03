package com.example.springtutorial.service;

import com.example.springtutorial.data.model.Address;
import com.example.springtutorial.data.model.Customer;

import java.util.Date;

/**
 * Created by AshoJa on 6/3/2016.
 */

public class CustomerService {

    public Customer createCustomer() {

        Customer customer = new Customer();
        customer.setFirstName("Ashok");
        customer.setLastName("Jaiswal");
        customer.setDateofBirth(new Date());
        customer.setOccupation("Software Engineer");
        customer.setAddress(new Address("3466 Data Dr", "Rancho Cordova", "CA", "USA", "95670"));
        return customer;
    }
}

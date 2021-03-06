package com.example.springtutorial.service;

import com.example.springtutorial.data.model.Address;
import com.example.springtutorial.data.model.Customer;

import java.util.Date;

/**
 * Created by AshoJa on 6/3/2016.
 */

public class CustomerService {

    public Customer createCustomer(String firstname, String lastname) {

        Customer customer = new Customer();
        customer.setFirstName(firstname);
        customer.setLastName(lastname);
        customer.setDateofBirth(new Date());
        customer.setOccupation("Software Engineer");
        customer.setAddress(new Address("1234 Awesome Street", "Rancho Cordova", "CA", "USA", "95670"));
        return customer;
    }
}

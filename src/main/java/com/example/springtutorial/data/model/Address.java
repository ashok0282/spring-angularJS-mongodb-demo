package com.example.springtutorial.data.model;

/**
 * Created by AshoJa on 6/3/2016.
 */
public class Address {

    private String streetName;

    private String city;

    private String state;

    private String country;

    private String zipcode;

    public Address(String streetName, String city, String state, String country, String zipcode) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

package com.dcisero.company.traventure.company.test.util;

import java.sql.Timestamp;


public class UserReport {

    private String FirstName;
    private String LastName;
    private String Address1;
    private String Address2;
    private String City;
    private String State;
    private int Zip;
    private String Country;
    private Timestamp Date;


    public UserReport(String firstName, String lastName, String address1, String address2, String city,
                      String state, int zip, String country, Timestamp date) {
        FirstName = firstName;
        LastName = lastName;
        Address1 = address1;
        Address2 = address2;
        City = city;
        State = state;
        Zip = zip;
        Country = country;
        Date = date;
    }


    public String getFirstName() {

        return FirstName;
    }

    public void setFirstName(String firstName) {

        this.FirstName = firstName;
    }

    public String getLastName() {

        return LastName;
    }

    public void setLastName(String lastName) {

        this.LastName = lastName;
    }

    public String getAddress1() {

        return Address1;
    }

    public void setAddress1(String address1) {

        this.Address1 = address1;
    }

    public String getAddress2() {

        return Address2;
    }

    public void setAddress2(String address2) {

        this.Address2 = address2;
    }

    public String getCity() {

        return City;
    }

    public void setCity(String city) {

        this.City = city;
    }

    public String getState() {

        return State;
    }

    public void setState(String state) {

        this.State = state;
    }

    public int getZip() {

        return Zip;
    }

    public void setZip(int zip) {

        this.Zip = zip;
    }

    public String getCountry() {

        return Country;
    }

    public void setCountry(String country) {

        this.Country = country;
    }


    public Timestamp getDate() {

        return Date;
    }

    public void setDate(Timestamp date) {

        Date = date;
    }



}

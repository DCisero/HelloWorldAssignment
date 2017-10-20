package com.dcisero.company.traventure.company.test.util;

public class Registration {
    private String FirstName;
    private String LastName;
    private String Address1;
    private String Address2;
    private String City;
    private String State;
    private int Zip;
    private String Country;

    public Registration() {
        FirstName = "";
        LastName = "";
        Address1 = "";
        Address2 = "";
        City = "";
        State = "";
        Zip = 0;
        Country = "";
    }

    public Registration(String firstName, String lastName, String address1, String address2, String city,
                        String state, int zip, String country) {
        FirstName = firstName;
        LastName = lastName;
        Address1 = address1;
        Address2 = address2;
        City = city;
        State = state;
        Zip = zip;
        Country = country;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int zip) {
        Zip = zip;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }


}

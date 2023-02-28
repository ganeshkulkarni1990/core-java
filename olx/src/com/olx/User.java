package com.olx;

import java.util.List;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private Salutation salutation;
    private String mobileNo; //check length 10
    private CountryCode countryCode;
    private String alternateMobileNo;
    private List<Address> addresses;

    private String username;

    private String password; //store encrypted password

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public void setAddress(List<Address> address) {
        this.addresses = address;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public void setAlternateMobileNo(String alternateMobileNo) {
        this.alternateMobileNo = alternateMobileNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public String getAlternateMobileNo() {
        return alternateMobileNo;
    }
}

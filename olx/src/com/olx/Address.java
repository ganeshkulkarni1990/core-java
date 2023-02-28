package com.olx;

public class Address {
    private String lane1;
    private String lane2;
    private String landmark;
    private String city;
    private String state;
    private CountryCode countryCode;
    private String pinCode; //length check 6

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getLane1() {
        return lane1;
    }

    public String getLane2() {
        return lane2;
    }

    public String getLandmark() {
        return landmark;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getAddress() {
        return lane1 + " " + lane2 + " " + landmark + " " + city + " " + state + " " + countryCode + " " + pinCode;
    }
}
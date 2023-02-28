package com.olx;

public class UserDetails {
    private String name;
    private String address;
    private String mobileNo;
    private String username;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString(){
        return "[" + name + " " + address + " " + address + " " + mobileNo + " " + username + "]";
    }
}
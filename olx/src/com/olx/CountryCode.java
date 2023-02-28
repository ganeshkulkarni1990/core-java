package com.olx;

public enum CountryCode {
    INDIA(91),
    PAK(92);
    CountryCode(int num) {
        this.number = num;
    }
    private int number;

    public int getNumber(){
        return this.number;
    }
};

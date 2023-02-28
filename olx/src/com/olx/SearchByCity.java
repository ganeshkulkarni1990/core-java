package com.olx;

import java.util.List;

class SearchByCity implements Search {

    private String city;

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public List<Post> search() {
        Olx olx = Olx.getInstance();
        List<Post> posts = olx.searchByCity(city);
        return posts ;
    }
}
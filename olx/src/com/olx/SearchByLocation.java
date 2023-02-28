package com.olx;

import java.util.List;

class SearchByLocation implements Search {

    private Location location;

    public void setCity(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public List<Post> search() {
        Olx olx = Olx.getInstance();
        List<Post> posts = olx.searchByLocation(location);
        return posts ;
    }
}

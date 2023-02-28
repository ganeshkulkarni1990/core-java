package com.olx;

import java.util.Date;

public class Post {
    private long id;
    private Date date;
    private Product product;
    private UserDetails createdBy; // user
    private Location location;
    private String title;
    private ContactDetails contactDetails;
    private String city;

    public void setId(long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCreatedBy(UserDetails createdBy) {
        this.createdBy = createdBy;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Product getProduct() {
        return product;
    }

    public UserDetails getCreatedBy() {
        return createdBy;
    }

    public Location getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public String getCity() {
        return city;
    }
}

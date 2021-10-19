package com.example.dinnerAPI.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="CITY")
    private String city;

    @Column(name="STATE")
    private String state;
    @Column(name="ZIPCODE")
    private String zipcode;

    @Column(name="INTERESTED_PEANUT")
    private boolean isInterestedPeanut;
    @Column(name="INTERESTED_DAIRY")
    private boolean isInterestedDairy;
    @Column(name="INTERESTED_EGG")
    private boolean isInterestedEgg;

    public User(String userName, String city, String state, String zipcode, boolean isInterestedPeanut, boolean isInterestedDairy, boolean isInterestedEgg) {
        this.userName = userName;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.isInterestedPeanut = isInterestedPeanut;
        this.isInterestedDairy = isInterestedDairy;
        this.isInterestedEgg = isInterestedEgg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isInterestedPeanut() {
        return isInterestedPeanut;
    }

    public void setInterestedPeanut(boolean interestedPeanut) {
        isInterestedPeanut = interestedPeanut;
    }

    public boolean isInterestedDairy() {
        return isInterestedDairy;
    }

    public void setInterestedDairy(boolean interestedDairy) {
        isInterestedDairy = interestedDairy;
    }

    public boolean isInterestedEgg() {
        return isInterestedEgg;
    }

    public void setInterestedEgg(boolean interestedEgg) {
        isInterestedEgg = interestedEgg;
    }
}

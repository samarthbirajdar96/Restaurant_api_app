package com.example.Restaurant.Entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Restaurant {
    public Restaurant(Integer restaurantId, String restaurantName, String restaurantAddress, String restaurantNumber, Speciality restaurantspeciality, int restaurantTotalStaff) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantNumber = restaurantNumber;
        this.restaurantspeciality = restaurantspeciality;
        this.restaurantTotalStaff = restaurantTotalStaff;
    }
    @NotNull
    private Integer restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantNumber;
    private Speciality restaurantspeciality;
    @Size(min=1, max=100)
    private int restaurantTotalStaff;

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public Speciality getRestaurantspeciality() {
        return restaurantspeciality;
    }

    public void setRestaurantspeciality(Speciality restaurantspeciality) {
        this.restaurantspeciality = restaurantspeciality;
    }

    public int getRestaurantTotalStaff() {
        return restaurantTotalStaff;
    }

    public void setRestaurantTotalStaff(int restaurantTotalStaff) {
        this.restaurantTotalStaff = restaurantTotalStaff;
    }



}



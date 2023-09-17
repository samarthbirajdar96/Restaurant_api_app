package com.example.Restaurant.Repo;

import com.example.Restaurant.Entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantRepo {

    @Autowired
   private  List<Restaurant> getrestaurant;

    public List<Restaurant> restaurantlist(){
        return getrestaurant;
    }


}

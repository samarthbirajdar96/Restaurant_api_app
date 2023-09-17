package com.example.Restaurant.Service;

import com.example.Restaurant.Entity.Restaurant;
import com.example.Restaurant.Repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ServiceRestaurant {
    @Autowired
    RestaurantRepo restaurantRepo;


    public String addrestaurant(List<Restaurant> restaurants) {
        getallRestaurant().addAll(restaurants);
        return "added";
    }

    public List<Restaurant> getallRestaurant() {
        return restaurantRepo.restaurantlist();
    }

    public String update(String name, String address) {
        for (Restaurant restaurant : getallRestaurant()) {
            if (restaurant.getRestaurantName().equals(name)) {
                restaurant.setRestaurantAddress(address);
                return "updated";
            }
        }
        return "restaurant :" +name+ "not found";
    }



    public String delete(Integer id) {
        for(Restaurant restaurant:getallRestaurant()){
            if(restaurant.getRestaurantId().equals(id)){
                getallRestaurant().remove(restaurant);
                return "deleted";
            }
        }
        return "restaurant :"+ id + "not found";
    }


    public Restaurant getRestaurant(Integer id){
        List<Restaurant>originalList = getallRestaurant();

        for (Restaurant restaurant : originalList){

            if(restaurant.getRestaurantId().equals(id)){
                return restaurant;
            }
        }

        throw new IllegalStateException("Restaurant not found");
    }




}





package com.example.Restaurant.Controller;

import com.example.Restaurant.Entity.Restaurant;
import com.example.Restaurant.Service.ServiceRestaurant;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class ContollerRestaurant {
    @Autowired
    ServiceRestaurant serviceRestaurant;
     @PostMapping("restaurant")
    public String addrestaurant(@RequestBody List<Restaurant> restaurants){
      return  serviceRestaurant.addrestaurant(restaurants);

    }
      @GetMapping("restaurants")
    public List<Restaurant> getallRestaurant(){
       return  serviceRestaurant.getallRestaurant();
    }


    @GetMapping("restaurant/{id}")
    public Restaurant getRestaurant(@PathVariable Integer id){
        return serviceRestaurant.getRestaurant(id);
    }

    @PutMapping("restaurant/name/{name}/address")
    public String update(@PathVariable String name,@RequestParam String address){
         return serviceRestaurant.update(name,address);
    }


    @DeleteMapping("restaurant/id/{id}")
    public String delete (@PathVariable  @Valid Integer id){
         return serviceRestaurant.delete(id);
    }


}

package com.example.Restaurant.Repo;

import com.example.Restaurant.Entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Datasource {
    @Bean
    public  List<Restaurant> datasourcelist(){
        return new ArrayList<>();
    }
}

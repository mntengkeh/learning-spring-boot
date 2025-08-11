package com.tasha.config;

import com.tasha.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanSource {

    @Bean
    public Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("Lambo");
        return vehicle;
    }
}

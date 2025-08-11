package com.tasha.config;

import com.tasha.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanSource {

    @Bean
    public Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }
}

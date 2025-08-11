package com.tasha.config;

import com.tasha.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanSource {

    @Bean(name="honda")
    public Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean(value="audi")
    public Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Primary
    @Bean("lambo")
    public Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("Lambo");
        return vehicle;
    }
}

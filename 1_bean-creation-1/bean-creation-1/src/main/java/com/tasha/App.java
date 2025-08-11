package com.tasha;


import com.tasha.beans.Vehicle;
import com.tasha.config.BeanSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        var vehicle = new Vehicle();
        vehicle.setName("Benz");
        System.out.println("POJO vehicle: " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(BeanSource.class);
        var vehicleB = context.getBean(Vehicle.class);
        System.out.println("Bean vehicle: " + vehicleB.getName());
    }
}

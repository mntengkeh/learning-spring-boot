package com.tasha;


import com.tasha.beans.Vehicle;
import com.tasha.config.BeanSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(BeanSource.class);

        var vehicleB = context.getBean("honda", Vehicle.class);
        System.out.println("Bean vehicle: " + vehicleB.getName());

        var vehicleB1 = context.getBean("audi", Vehicle.class);
        System.out.println("Bean vehicle: " + vehicleB1.getName());

        var vehicleB2 = context.getBean("lambo", Vehicle.class);
        System.out.println("Bean vehicle: " + vehicleB2.getName());

    }
}

package com.learn.marvel.app;

import com.learn.marvel.base.Vehicle;
import com.learn.marvel.vehicle.Car;

public class TestMethodHiding {

    public static void main(String[] args) {
        Vehicle vehicle=new Car();
        Car car=new Car();
        Vehicle.start();//Vehicle starting...
        vehicle.start();//Vehicle Starting..
        Car.start();//car starting..
        car.start();//Car staring..
        ((Vehicle)car).start();//Vehicle starting; Upcasting

        vehicle=car;
        vehicle.start();//Vehicle starting
        ((Car) vehicle).start();//Car starting..down casting


    }
}

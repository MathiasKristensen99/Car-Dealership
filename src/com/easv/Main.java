package com.easv;

import com.easv.be.Car;
import com.easv.be.Vehicle;
import com.easv.bll.CarFactory;
import com.easv.bll.ICarStrange;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ICarStrange printCar = new Car("BB235673", "Toyota", "Aygo", LocalDate.now(), 75_000);
        ArrayList<ICarStrange> printableCars = new ArrayList<>();
        for (ICarStrange cs : printableCars) {
            printCar.print();
        }

        List<Vehicle> vehicles = new ArrayList<>();
        CarFactory factory = new CarFactory();
        Vehicle car = factory.create("Car", 75000);
        vehicles.add(car);



        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(vehicles.get(i));
        }

    }
}

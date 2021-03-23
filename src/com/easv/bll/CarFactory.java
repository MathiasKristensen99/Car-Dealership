package com.easv.bll;

import com.easv.be.Car;
import com.easv.be.Truck;
import com.easv.be.Vehicle;

import java.time.LocalDate;

public class CarFactory {
    public Vehicle create(String vehicleType, double price) {
        switch (vehicleType) {
            case "Car":
                return new Car("BB445763", "Toyota", "Aygo", LocalDate.now(), 75_000);

            case "Truck":
                return new Truck("AX458524", "Volvo", "Gigatruck", LocalDate.now(), 200_000);

            default:
                throw new AssertionError();

        }
    }
}

package com.easv.be;

import java.time.LocalDate;

public class Car extends Vehicle{
    public Car(String licensePlate, String factory, String model, LocalDate dateBuild, float price) {
        super(licensePlate, factory, model, dateBuild, price);
    }
}

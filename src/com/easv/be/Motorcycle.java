package com.easv.be;

import java.time.LocalDate;

public class Motorcycle extends Vehicle{
    public Motorcycle(String licensePlate, String factory, String model, LocalDate dateBuild, float price) {
        super(licensePlate, factory, model, dateBuild, price);
    }
}

package com.easv.be;

import java.time.LocalDate;

public class Truck extends Vehicle{
    public Truck(String licensePlate, String factory, String model, LocalDate dateBuild, float price) {
        super(licensePlate, factory, model, dateBuild, price);
    }
}

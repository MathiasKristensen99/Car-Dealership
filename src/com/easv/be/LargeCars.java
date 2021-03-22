package com.easv.be;

import java.time.LocalDate;

public class LargeCars extends Vehicle{
    public LargeCars(String licensePlate, String factory, String model, LocalDate dateBuild, float price) {
        super(licensePlate, factory, model, dateBuild, price);
    }
}

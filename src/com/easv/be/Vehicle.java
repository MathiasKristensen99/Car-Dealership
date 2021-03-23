package com.easv.be;

import java.time.LocalDate;

public class Vehicle implements com.easv.bll.ICarStrange {
    private String LicensePlate;
    private String Factory;
    private String Model;
    private LocalDate dateBuild;
    private double Price;

    public Vehicle(String licensePlate, String factory, String model, LocalDate dateBuild, double price) {
        LicensePlate = licensePlate;
        Factory = factory;
        Model = model;
        this.dateBuild = dateBuild;
        Price = price;
    }

    @Override
    public String getLicensePlate() {
        return LicensePlate;
    }

    @Override
    public void setLicensePlate(String licensePlate) {
        this.LicensePlate = licensePlate;
    }

    @Override
    public String getFactory() {
        return Factory;
    }

    @Override
    public void setFactory(String factory) {
        this.Factory = factory;
    }

    @Override
    public String getModel() {
        return Model;
    }

    @Override
    public void setModel(String model) {
        this.Model = model;
    }

    @Override
    public LocalDate getDateBuild() {
        return dateBuild;
    }

    @Override
    public void setDateBuild(LocalDate dateBuild) {
        this.dateBuild = dateBuild;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println(this.LicensePlate + ", " + this.Factory + ", " + this.Price + ", " + this.dateBuild + ", " + this.Model);
    }

    @Override
    public void setPrice(double price) {
        this.Price = price;
    }
}

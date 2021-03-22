package com.easv.bll;

import java.time.LocalDate;

public interface ICarStrange {
    String getLicensePlate();

    void setLicensePlate(String licensePlate);

    String getFactory();

    void setFactory(String factory);

    String getModel();

    void setModel(String model);

    LocalDate getDateBuild();

    void setDateBuild(LocalDate dateBuild);

    double getPrice();

    void setPrice(double price);
}

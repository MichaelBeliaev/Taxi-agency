package com.taxiagency;

import com.taxiagency.dao.Dao;
import com.taxiagency.dao.DriverRamDao;
import com.taxiagency.dao.FileDao;
import com.taxiagency.domain.Driver;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dao<Driver> daoDriver = new DriverRamDao();
        Driver driver = new Driver("123","Vasya");
        Driver driver2 = new Driver("124","Fedia");
        Driver driver3 = new Driver("125","Tolya");

        daoDriver.save(driver);
        //daoDriver.save(driver);
        daoDriver.save(driver2);
        daoDriver.save(driver3);

        List<Driver> drivers = daoDriver.findAll();
        System.out.println(drivers);

        Dao<Driver> daofileDriver = new FileDao<>();
        daofileDriver.save(driver);
        daofileDriver.save(driver3);
        daofileDriver.save(driver2);

        List<Driver> filedrivers = daoDriver.findAll();
        System.out.println(filedrivers);



    }
}

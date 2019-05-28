package com.taxiagency.dao;

import com.taxiagency.domain.Driver;
import java.util.*;

public class DriverRamDao extends RamDao implements DriverDao {

    private Map<String, Driver> ramDriver;

    public DriverRamDao() {

        this.ramDriver = new HashMap<>();
    }

    @Override
    public List<Driver> findByName(String name) {

        List<Driver> list = new ArrayList<>();
        Set<String> set =  ramDriver.keySet();
        for(String n: set){
            Driver o=ramDriver.get(n);

            if(o.getName().equals(name)){
                list.add(o);
            }
        }
        return list;
    }
}


package com.taxiagency.dao;

import com.taxiagency.domain.Car;

import java.awt.*;
import java.util.List;

public interface CarDao {

    List<Car> findByNumber (String number);
    List<Car> findByColor (Color color);
}

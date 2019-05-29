package com.taxiagency.dao;

import com.taxiagency.domain.Trip;

import java.util.List;

public interface TripDao extends Dao<Trip> {
    List<Trip> findByRoute (String route);

}

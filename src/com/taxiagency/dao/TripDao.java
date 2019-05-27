package com.taxiagency.dao;

import com.taxiagency.domain.Trip;

import java.util.List;

public interface TripDao {
    List<Trip> findByRoute (String route);

}

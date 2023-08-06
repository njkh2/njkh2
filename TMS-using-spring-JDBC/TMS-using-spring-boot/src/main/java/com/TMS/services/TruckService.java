package com.TMS.services;

import com.TMS.entity.Truck;

import java.util.List;

public interface TruckService {
    public Truck saveTruck(Truck truck);

    public List<Truck> fetchTruckList();

    public Truck fetchTruckById(Long id);

    public void deleteTruckById(Long id);

    public Truck updateTruck(Long id, Truck truck);

    public Truck fetchTruckByTruckNumber(String truckNumber);
}

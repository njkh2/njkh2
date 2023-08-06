package com.TMS.services;

import com.TMS.entity.Driver;

import java.util.List;

public interface DriverService {
    public Driver saveDriver(Driver driver);

    public List<Driver> fetchDriverList();

    public Driver fetchDriverById(Long id);

    public void deleteDriverById(Long id);

    public Driver updateDriver(Long id, Driver driver);
}

package com.TMS.services;

import com.TMS.entity.Driver;
import com.TMS.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DriverServiceImpl implements DriverService{
    @Autowired
    private DriverRepository driverRepository;
    @Override
    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver) ;
    }

    @Override
    public List<Driver> fetchDriverList() {
        return driverRepository.findAll();
    }

    @Override
    public Driver fetchDriverById(Long id) {
        return driverRepository.findById(id).get();
    }

    @Override
    public void deleteDriverById(Long id) {
        driverRepository.deleteById(id);
    }

    @Override
    public Driver updateDriver(Long id, Driver driver) {
        Driver driverdb = driverRepository.findById(id).get();
        if(Objects.nonNull(driver.getLicenseNumber()) &&
        !"".equalsIgnoreCase(driver.getLicenseNumber())){
            driverdb.setLicenseNumber(driver.getLicenseNumber());
        }
        if(Objects.nonNull(driver.getName()) &&
        !"".equalsIgnoreCase(driver.getName())){
            driverdb.setName(driver.getName());
        }
        if(Objects.nonNull(driver.getMobile()) &&
        !"".equalsIgnoreCase(driver.getMobile())){
            driverdb.setMobile(driver.getMobile());
        }
        return driverRepository.save(driverdb);
    }


}

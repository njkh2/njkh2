package com.TMS.controller;

import com.TMS.entity.Driver;
import com.TMS.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {
    @Autowired
    private DriverService driverService;

    @PostMapping("/driver")
    public Driver saveDriver(@RequestBody Driver driver){
        return driverService.saveDriver(driver);
    }

    @GetMapping("/driver")
    public List<Driver> fetchDriverList(){
        return driverService.fetchDriverList();
    }

    @GetMapping("/driver/{id}")
    public Driver fetchDriverById(@PathVariable("id") Long id){
        return driverService.fetchDriverById(id);
    }

    @DeleteMapping("/driver/{id}")
    public String deleteDriverById(@PathVariable("id") Long id){
        driverService.deleteDriverById(id);
        return "Driver data deleted Successfully";
    }

    @PutMapping("/driver/{id}")
    public Driver updateDriver(@PathVariable("id") Long id,
                               @RequestBody Driver driver){
        return driverService.updateDriver(id,driver);
    }
}

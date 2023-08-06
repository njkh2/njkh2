package com.TMS.repository;

import com.TMS.entity.Driver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DriverRepositoryTest {

    @Autowired
    private DriverRepository driverRepository;


    @Test
    public void saveDriver(){
        Driver driver = new Driver();
        driver.setName("Krish Gupta");
        driver.setMobile("253165413");
        driver.setLicenseNumber("asfa452354");
        driverRepository.save(driver);
    }

    @Test
    public void getByName(){
        List<Driver> drivers = driverRepository.findByNameContaining("GUP ");
        for (Driver d : drivers){
            System.out.println(d);
        }
    }
}
package com.TMS.repository;

import com.TMS.entity.Truck;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TruckRepositoryTest {
    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private TruckRepository truckRepository;

    @Test
    public void saveStudent(){
        Truck truck = Truck.builder()
                .truckNumber("MH04FJ8605")
                .insuranceExpire("10-10-2023")
                .passingExpire("10-10-2023")
                .permitExpire("10-10-2023")
                .driver(driverRepository.findById(2L).get())
                .build();
        truckRepository.save(truck);
    }

    @Test
    public void printAllTruck(){
        List<Truck> trucks = truckRepository.findAll();
        for(Truck t:trucks){
            System.out.println(t);
        }
    }

    @Test
    public void getByIdAndTruckNumber(){
        Truck truck = truckRepository.findByIdAndTruckNumber(1,"MH04FD5372");
        System.out.println(truck);
    }

    @Test
    public void getByTruckNumeber(){
        Truck truck = truckRepository.getTruckbyTruckNumberNameParam("MH04FD5372");
        System.out.println(truck);
    }

    @Test
    public void updatePermitByTruckNumber(){
        int n = truckRepository.updatePermitByTruckNumber("20-02-2025","MH04FD5372");
        System.out.println(n);
    }

}
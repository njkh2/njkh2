package com.TMS.controller;


import com.TMS.entity.Truck;
import com.TMS.services.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TruckController {
    @Autowired
    private TruckService truckService;

    // as we are getting the object from the client side we get it in json format and we have to make sure
    // this json is converted to our model i.e entity
    @PostMapping("/truck")
    public Truck saveTruck(@RequestBody Truck truck){
        return truckService.saveTruck(truck);
    }

    @GetMapping("/truck")
    public List<Truck> fetchTruckList(){
        return truckService.fetchTruckList();
    }

    @GetMapping("/truck/{id}")
    public Truck fetchTruckById(@PathVariable("id") Long id){
        return truckService.fetchTruckById(id);
    }

    @DeleteMapping("/truck/{id}")
    public String deleteTruckById(@PathVariable("id") Long id){
        truckService.deleteTruckById(id);
        return "truck deleted successfully";
    }


    @PutMapping("/truck/{id}")
    public Truck updateTruck(@PathVariable Long id,
                             @RequestBody Truck truck){
        return truckService.updateTruck(id,truck);
    }

    @GetMapping("/truck/truckNumber/{truckNumber}")
    public Truck fetchTruckByTruckNumber(@PathVariable("truckNumber") String truckNumber){
        return truckService.fetchTruckByTruckNumber(truckNumber);
    }
}

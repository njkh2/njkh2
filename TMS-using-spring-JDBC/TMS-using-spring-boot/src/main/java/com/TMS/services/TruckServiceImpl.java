package com.TMS.services;

import com.TMS.entity.Truck;
import com.TMS.repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TruckServiceImpl implements TruckService{
    @Autowired
    private TruckRepository truckRepository;
    @Override
    public Truck saveTruck(Truck truck) {
        return truckRepository.save(truck);
    }

    @Override
    public List<Truck> fetchTruckList() {
        return truckRepository.findAll();
    }

    @Override
    public Truck fetchTruckById(Long id) {
        return truckRepository.findById(id).get();
    }

    @Override
    public void deleteTruckById(Long id) {
        truckRepository.deleteById(id);
    }

    @Override
    public Truck updateTruck(Long id, Truck truck) {
        Truck truckdb = truckRepository.findById(id).get();
        if(Objects.nonNull(truck.getTruckNumber()) &&
        !"".equalsIgnoreCase(truck.getTruckNumber())){
            truckdb.setTruckNumber(truck.getTruckNumber());
        }
        if(Objects.nonNull(truck.getPassingExpire()) &&
                !"".equalsIgnoreCase(truck.getPassingExpire())){
            truckdb.setPassingExpire(truck.getPassingExpire());
        }
        if(Objects.nonNull(truck.getPermitExpire()) &&
                !"".equalsIgnoreCase(truck.getPermitExpire())){
            truckdb.setPermitExpire(truck.getPermitExpire());
        }
        if(Objects.nonNull(truck.getInsuranceExpire()) &&
                !"".equalsIgnoreCase(truck.getInsuranceExpire())){
            truckdb.setInsuranceExpire(truck.getInsuranceExpire());
        }

        return truckRepository.save(truckdb);
    }

    @Override
    public Truck fetchTruckByTruckNumber(String truckNumber) {
        return truckRepository.findByTruckNumberIgnoreCase(truckNumber);
    }
}

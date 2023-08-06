package com.TMS.repository;

import com.TMS.entity.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.stylesheets.LinkStyle;

import java.awt.*;
import java.util.List;

@Repository
public interface TruckRepository extends JpaRepository<Truck,Long> {
    public Truck findByTruckNumberIgnoreCase(String truckNumber);

    // find all trucks that have the insurance expire date same
    public List<Truck> findByInsuranceExpire(String insuranceExpire);

    public Truck findByIdAndTruckNumber(Integer id, String truckNumber);

    @Query(
            value = "select * from Truck t where t.truck_number = ?1",
            nativeQuery = true
    )
    public Truck getTruckbyTruckNumber(String truckNumber);

    @Query(
            value = "select * from Truck t where t.truck_number = :truckNumber",
            nativeQuery = true
    )
    public Truck getTruckbyTruckNumberNameParam(@Param("truckNumber") String truckNumber);

    @Modifying
    @Transactional
    @Query(
            value = "update truck set permit_expire = :permitExpire where truck_number = :truckNumber",
            nativeQuery = true
    )
    public int updatePermitByTruckNumber(
            @Param("truckNumber") String truckNumber,
            @Param("permitExpire") String permitExpire);

}

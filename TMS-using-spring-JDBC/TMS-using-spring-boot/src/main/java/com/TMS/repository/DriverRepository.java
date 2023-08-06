package com.TMS.repository;

import com.TMS.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver,Long> {

    public List<Driver> findByNameContaining(String name);
}

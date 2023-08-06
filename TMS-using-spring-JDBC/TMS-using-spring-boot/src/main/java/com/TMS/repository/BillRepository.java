package com.TMS.repository;

import com.TMS.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {
}

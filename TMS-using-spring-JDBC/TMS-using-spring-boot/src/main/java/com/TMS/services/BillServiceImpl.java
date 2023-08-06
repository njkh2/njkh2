package com.TMS.services;

import com.TMS.entity.Bill;
import com.TMS.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;
    @Override
    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public List<Bill> fetchBillList() {
        return billRepository.findAll();
    }

    @Override
    public Bill fetchBillByBillNumber(int billNumber) {
        return billRepository.findById(billNumber).get();
    }

    @Override
    public void deleteBill(int billNumber) {
        billRepository.deleteById(billNumber);
    }

    @Override
    public Bill updateBill(Bill bill, int billNumber) {
        Bill billdb = billRepository.findById(billNumber).get();
        if(Objects.nonNull(bill.getTransporterName()) &&
        !"".equalsIgnoreCase(bill.getTransporterName())){
            billdb.setTransporterName(bill.getTransporterName());
        }
        if(Objects.nonNull(bill.getSourceAndDestination()) &&
        !"".equalsIgnoreCase(bill.getSourceAndDestination())){
            billdb.setSourceAndDestination(bill.getSourceAndDestination());
        }
        if(!"".equalsIgnoreCase(String.valueOf(bill.getTruckCharge()))){
            billdb.setTruckCharge(bill.getTruckCharge());
        }
        if(!"".equalsIgnoreCase(String.valueOf(bill.getExtra()))){
            billdb.setExtra(bill.getExtra());
        }
        if(!"".equalsIgnoreCase(String.valueOf(bill.getLessAdvance()))){
            billdb.setLessAdvance(bill.getLessAdvance());
        }
        if(!"".equalsIgnoreCase(String.valueOf(bill.getBalance()))){
            billdb.setBalance(bill.getBalance());
        }
        if(Objects.nonNull(bill.getTruckNumber()) &&
                !"".equalsIgnoreCase(bill.getTruckNumber())){
            billdb.setTruckNumber(bill.getTruckNumber());
        }
        if(Objects.nonNull(bill.getContainerNumber()) &&
                !"".equalsIgnoreCase(bill.getContainerNumber())){
            billdb.setContainerNumber(bill.getContainerNumber());
        }
        if(Objects.nonNull(bill.getPickupDate()) &&
                !"".equalsIgnoreCase(bill.getPickupDate())){
            billdb.setPickupDate(bill.getPickupDate());
        }
        if(Objects.nonNull(bill.getEmptyDate()) &&
                !"".equalsIgnoreCase(bill.getEmptyDate())){
            billdb.setEmptyDate(bill.getEmptyDate());
        }

        return billRepository.save(billdb);
    }
}

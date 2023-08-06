package com.TMS.controller;

import com.TMS.entity.Bill;
import com.TMS.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
public class BillController {

    @Autowired
    private BillService billService;

    @PostMapping("/bill")
    public Bill saveBill(@RequestBody Bill bill){
        return billService.saveBill(bill);
    }

    @GetMapping("/bill")
    public List<Bill> fetchBillList(){
        return billService.fetchBillList();
    }

    @GetMapping("/bill/{billNumber}")
    public Bill fetchBillByBillNumber(@PathVariable("billNumber") int billNumber){
        return billService.fetchBillByBillNumber(billNumber);
    }

    @DeleteMapping("/bill/{billNumber}")
    public String deleteBill(@PathVariable("billNumber") int billNumber){
        billService.deleteBill(billNumber);
        return "Bill Deleted Successfully";
    }

    @PutMapping("/bill/{billNumber}")
    public Bill updateBill( @RequestBody Bill bill,
                            @PathVariable("billNumber") int billNumber){
        return billService.updateBill(bill,billNumber);
    }
}

package com.TMS.services;

import com.TMS.entity.Bill;

import java.util.List;

public interface BillService {
    public Bill saveBill(Bill bill);

    public List<Bill> fetchBillList();

    public Bill fetchBillByBillNumber(int billNumber);

    public void deleteBill(int billNumber);

    public Bill updateBill(Bill bill, int billNumber);
}

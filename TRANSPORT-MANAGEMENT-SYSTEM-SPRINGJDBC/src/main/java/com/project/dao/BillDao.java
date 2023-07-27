package com.project.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.project.entities.Bill;
import com.project.utility.HibernateUtil;

public class BillDao {
	public void createBill(Bill bill)throws Exception{
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(bill);
		transaction.commit();
		session.close();
	}
	
	public Bill getBill(int billNumber, String truckNumber) throws Exception{
		Bill bill = null;
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "FROM bill b WHERE b.billNumber = :billNumber AND b.truckNumber = :truckNumber";
		Query query = session.createQuery(hql);
		query.setParameter("billNumber", billNumber);
		query.setParameter("truckNumber", truckNumber);
		bill = (Bill)query.uniqueResult();
		return bill;
	}
	
}

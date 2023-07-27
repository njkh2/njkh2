package com.project.dao;import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.project.entities.Driver;
import com.project.utility.HibernateUtil;

public class DriverDao {
	public void saveDriver(Driver driver)throws Exception {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(driver);
		transaction.commit();
	}
	
	public Driver getDriver(String license, String truckNumber) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "FROM Driver d WHERE d.license = :license AND d.truckNumber = :truckNumber";
		Query query = session.createQuery(hql);
		query.setParameter("license", license);
		query.setParameter("truckNumber", truckNumber);
		Driver d1 =(Driver) query.uniqueResult();
		transaction.commit();
		session.close();
		return d1;
	}
	
	public void updateDriver(Driver driver) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		Driver d1 = getDriver(driver.getLicense(),driver.getTruckNumber());
		d1 = driver;
		session.update(d1);
		transaction.commit();
		session.close();
	}
	
	public void deleteDriver(String license, String truckNumber) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		Driver driver = getDriver(license,truckNumber);

		session.delete(driver);
		transaction.commit();
		session.close();
	}
}
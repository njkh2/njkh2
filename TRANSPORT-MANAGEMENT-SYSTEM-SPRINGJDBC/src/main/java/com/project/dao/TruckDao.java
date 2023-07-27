package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.project.entities.Truck;
import com.project.utility.HibernateUtil;

public class TruckDao {
	public void saveTruck(Truck truck) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionfactory().openSession()){
			transaction = session.beginTransaction();
			session.persist(truck);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void updateTruck(Truck truck) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionfactory().openSession()){
			transaction=session.beginTransaction();
			Truck t1 = getTruck(truck.getUser(),truck.getTruckNumber());
			t1.setInsuranceExpire(truck.getInsuranceExpire());
			t1.setPassingExpire(truck.getPassingExpire());
			t1.setPermitExpire(truck.getPermitExpire());
			session.update(t1);
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Truck getTruck(int user, String truckNumber) throws Exception{
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "FROM Truck t WHERE t.user = :user AND t.truckNumber = :truckNumber";
		Query query = session.createQuery(hql);
		query.setParameter("user", user);
		query.setParameter("truckNumber",truckNumber);
		Truck truck = (Truck) query.uniqueResult();
		return truck;
	}
	
	public void deleteTruck(int user, String truckNumber) throws Exception{
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		Truck truck = getTruck(user,truckNumber);
		session.delete(truck);
		transaction.commit();
	}
	
	public List<Truck> getAllTrucks(int user){
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "from Truck t WHERE t.user = :user";
		Query query = session.createQuery(hql);
		query.setParameter("user", user);
		List<Truck> trucks = new ArrayList<>(query.list());
		return trucks;
	}

}

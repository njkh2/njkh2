package com.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project.entities.User;
import com.project.utility.HibernateUtil;

public class UserDao {
	public void saveUser(User user) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			transaction = session.beginTransaction();
			session.persist(user);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	public User getUserById(int id) {
		try (Session session = HibernateUtil.getSessionfactory().openSession()){
			return session.get(User.class,id);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<User> getAllUsers(){
		try (Session session = HibernateUtil.getSessionfactory().openSession()){
			return session.createQuery("from User",User.class).list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void updateUser(User user) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionfactory().openSession()){
			transaction = session.beginTransaction();
			session.update(user);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void deleteUser(User user) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionfactory().openSession()){
			transaction = session.beginTransaction();
			session.delete(user);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}

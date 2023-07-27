package com.project.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.dao.DriverDao;
import com.project.dao.TruckDao;
import com.project.dao.UserDao;
import com.project.entities.Driver;
import com.project.entities.Truck;
import com.project.entities.User;


public class App {
	public static void main(String[] args) throws Exception {
		DriverDao driverDao = new DriverDao();
//		Driver driver = new Driver();
//		driver.setLicense("1234");
//		driver.setDriverName("Shankar");
//		driver.setTruckNumber("MH04FD5372");
//		driver.setMobile("987654321");
		driverDao.deleteDriver("1234","MH04Fj8603");
	}
}

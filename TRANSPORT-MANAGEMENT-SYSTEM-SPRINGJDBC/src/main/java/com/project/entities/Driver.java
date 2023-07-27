package com.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="drivers")
public class Driver {
	
	@Id
	@Column(name="license")
	private String license;
	@Column(name="truck_number")
	private String truckNumber;
	@Column(name="driver_name")
	private String driverName;
	@Column(name="mobile")
	private String mobile;

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String vehicleNumber) {
		this.truckNumber = vehicleNumber;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	

	public Driver(String license, String vehicleNumber, String driverName, String mobile) {
		super();
		this.license = license;
		this.truckNumber = vehicleNumber;
		this.driverName = driverName;
		this.mobile = mobile;
		
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Driver [license=" + license + ", vehicleNumber=" + truckNumber + ", driverName=" + driverName
				+ ", mobile=" + mobile + "]";
	}

}
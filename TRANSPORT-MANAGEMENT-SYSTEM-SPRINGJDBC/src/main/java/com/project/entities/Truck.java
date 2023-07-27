package com.project.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="trucks")
public class Truck {

	
	
	@Id
	@Column(name="truck_number")
	private String truckNumber;
	@Column(name="passing_expire")
	private String passingExpire;
	@Column(name="permit_expire")
	private String permitExpire;
	@Column(name="insurance_expire")
	private String insuranceExpire;
	@Column(name="user_id")
	private int user;
	

	

	public Truck(int user, String truckNumber, String passingExpire, String permitExpire, String insuranceExpire) {
		super();
		this.user = user;
		this.truckNumber = truckNumber;
		this.passingExpire = passingExpire;
		this.permitExpire = permitExpire;
		this.insuranceExpire = insuranceExpire;
	}

	@Override
	public String toString() {
		return "Truck [user=" + user + ", truckNumber=" + truckNumber + ", passingExpire=" + passingExpire
				+ ", permitExpire=" + permitExpire + ", insuranceExpire=" + insuranceExpire + "]";
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	public String getPassingExpire() {
		return passingExpire;
	}

	public void setPassingExpire(String passingExpire) {
		this.passingExpire = passingExpire;
	}

	public String getPermitExpire() {
		return permitExpire;
	}

	public void setPermitExpire(String permitExpire) {
		this.permitExpire = permitExpire;
	}

	public String getInsuranceExpire() {
		return insuranceExpire;
	}

	public void setInsuranceExpire(String insuranceExpire) {
		this.insuranceExpire = insuranceExpire;
	}

	public Truck() {
		// TODO Auto-generated constructor stub
	}

}


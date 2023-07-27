package com.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="bills")
public class Bill {

	private int id;
	@Id
	@Column(name="bill_number")
	private int billNumber;
	@Column(name="transporter_name")
	private String transporterName;
	@Column(name="import_export")
	private String importExport;
	@Column(name="pickup_from")
	private String pickupFrom;
	@Column(name="pickup_to")
	private String pickupTo;
	@Column(name="back_to")
	private String backTo;
	@Column(name="truck_charge")
	private long truckCharge;
	@Column(name="less_advance")
	private long lessAdvance;
	@Column(name="extra")
	private long extra;
	@Column(name="balance")
	private long balance;

	@Column(name="truck_number")
	private String truckNumber;
	@Column(name="container_number")
	private String containerNumber;
	@Column(name="load_date")
	private String loadDate;
	@Column(name="empty_date")
	private String emptyDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Bill(int billNumber, String partyName, String importExport, String pickupFrom, String pickupTo,
			String backTo, long truckCharge, long lessAdvance, long extra, long balance, String vehicleNumber,
			String containerNumber, String loadDate, String emptyDate) {
		super();
		this.billNumber = billNumber;
		this.transporterName = partyName;
		this.importExport = importExport;
		this.pickupFrom = pickupFrom;
		this.pickupTo = pickupTo;
		this.backTo = backTo;
		this.truckCharge = truckCharge;
		this.lessAdvance = lessAdvance;
		this.extra = extra;
		this.balance = balance;
		this.truckNumber = vehicleNumber;
		this.containerNumber = containerNumber;
		this.loadDate = loadDate;
		this.emptyDate = emptyDate;
	}

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public String getTransporterName() {
		return transporterName;
	}

	public void setTransporterName(String partyName) {
		this.transporterName = partyName;
	}

	public String getImportExport() {
		return importExport;
	}

	public void setImportExport(String importExport) {
		this.importExport = importExport;
	}

	public String getPickupFrom() {
		return pickupFrom;
	}

	public void setPickupFrom(String pickupFrom) {
		this.pickupFrom = pickupFrom;
	}

	public String getPickupTo() {
		return pickupTo;
	}

	public void setPickupTo(String pickupTo) {
		this.pickupTo = pickupTo;
	}

	public String getBackTo() {
		return backTo;
	}

	public void setBackTo(String backTo) {
		this.backTo = backTo;
	}

	public long getTruckCharge() {
		return truckCharge;
	}

	public void setTruckCharge(long truckCharge) {
		this.truckCharge = truckCharge;
	}

	public long getLessAdvance() {
		return lessAdvance;
	}

	public void setLessAdvance(long lessAdvance) {
		this.lessAdvance = lessAdvance;
	}

	public long getExtra() {
		return extra;
	}

	public void setExtra(long extra) {
		this.extra = extra;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String vehicleNumber) {
		this.truckNumber = vehicleNumber;
	}

	public String getContainerNumber() {
		return containerNumber;
	}

	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}

	public String getLoadDate() {
		return loadDate;
	}

	public void setLoadDate(String loadDate) {
		this.loadDate = loadDate;
	}

	public String getEmptyDate() {
		return emptyDate;
	}

	public void setEmptyDate(String emptyDate) {
		this.emptyDate = emptyDate;
	}

	@Override
	public String toString() {
		return "Bill [billNumber=" + billNumber + ", partyName=" + transporterName + ", importExport=" + importExport
				+ ", pickupFrom=" + pickupFrom + ", pickupTo=" + pickupTo + ", backTo=" + backTo + ", truckCharge="
				+ truckCharge + ", lessAdvance=" + lessAdvance + ", extra=" + extra + ", balance=" + balance
				+ ", vehicleNumber=" + truckNumber + ", containerNumber=" + containerNumber + ", loadDate=" + loadDate
				+ ", emptyDate=" + emptyDate + ", id=" + id + "]";
	}

}

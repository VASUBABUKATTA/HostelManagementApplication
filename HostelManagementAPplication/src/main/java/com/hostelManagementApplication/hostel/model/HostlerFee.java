package com.hostelManagementApplication.hostel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "hostlerFee")
public class HostlerFee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
private String hostlerMobile;
	private String hostlertEmail;
	private String hostlerName;
	private String hostelName;
	private String hostlerRoomNo;
	private String month;
	private String paymentStatus ;
	private String amountToPay;
	
	@ManyToOne
    @JoinColumn(name = "hostel_id")
    private Hostel hostel;
	
//	@ManyToOne
//	@JoinColumn(name = "hostler_id")
//	private Hostler hostler;
	
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	public long getId() {
		return id;
	}
//	public Hostler getHostler() {
//		return hostler;
//	}
//	public void setHostler(Hostler hostler) {
//		this.hostler = hostler;
//	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHostlerMobile() {
		return hostlerMobile;
	}
	public void setHostlerMobile(String hostlerMobile) {
		this.hostlerMobile = hostlerMobile;
	}
	public String getHostlertEmail() {
		return hostlertEmail;
	}
	public void setHostlertEmail(String hostlertEmail) {
		this.hostlertEmail = hostlertEmail;
	}
	public String getHostlerName() {
		return hostlerName;
	}
	public void setHostlerName(String hostlerName) {
		this.hostlerName = hostlerName;
	}
	public String getHostlerRoomNo() {
		return hostlerRoomNo;
	}
	public void setHostlerRoomNo(String hostlerRoomNo) {
		this.hostlerRoomNo = hostlerRoomNo;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getAmountToPay() {
		return amountToPay;
	}
	public void setAmountToPay(String amountToPay) {
		this.amountToPay = amountToPay;
	}
	
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	
	
	public HostlerFee(long id, String hostlerMobile, String hostlertEmail, String hostlerName, String hostelName,
			String hostlerRoomNo, String month, String paymentStatus, String amountToPay, Hostel hostel) {
		super();
		this.id = id;
		this.hostlerMobile = hostlerMobile;
		this.hostlertEmail = hostlertEmail;
		this.hostlerName = hostlerName;
		this.hostelName = hostelName;
		this.hostlerRoomNo = hostlerRoomNo;
		this.month = month;
		this.paymentStatus = paymentStatus;
		this.amountToPay = amountToPay;
		this.hostel = hostel;
	}
	
	public HostlerFee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

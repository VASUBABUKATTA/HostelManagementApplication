package com.hostelManagementApplication.hostel.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hostelManagementApplication.hostel.model.Hostel;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class HostlerFeeDto {

private long id;
	
	@NotBlank(message = "Hostler mobile number cannot be blank")
	@Pattern(regexp = "(^[6-9][0-9]{9}$)", message = "Hostler mobile number must be 10 digits")
	private String hostlerMobile;
	
	@NotBlank(message = "Hostler email is required")
    @Email(message = "Hostler email must be a valid email address")
	private String hostlertEmail;
	
	 @NotBlank(message = "Hostler name is required")
	 @Size(min = 2, max = 50, message = "Hostler name must be between 2 and 50 characters")
	private String hostlerName;
	 
	 @NotBlank(message = "Hostel name is required")
	 @Size(min = 2, max = 50, message = "Hostel name must be between 2 and 50 characters")
	private String hostelName;
	 
	 
	 @NotBlank(message = "Hostler room number is required")
	private String hostlerRoomNo;
	 
	 @NotBlank(message = "Month  is required")
	private String month;
	 @NotBlank(message = "PaymentStatus  is required")
	private String paymentStatus;
	 
	 @NotBlank(message = "Amount to pay  is required")
	private String amountToPay;
	
	 	@ManyToOne
	    @JoinColumn(name = "hostel_id")
	    @JsonBackReference
	    private Hostel hostel;
	
//	@ManyToOne
//	@JoinColumn(name = "hostler_id")
//	private Hostler hostler;
//	
	
	public Hostel getHostel() {
			return hostel;
		}
		public void setHostel(Hostel hostel) {
			this.hostel = hostel;
		}
	public long getId() {
		return id;
	}
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
	
	
	
	public HostlerFeeDto(long id,
			@NotBlank(message = "Hostler mobile number cannot be blank") @Pattern(regexp = "(^[6-9][0-9]{9}$)", message = "Hostler mobile number must be 10 digits") String hostlerMobile,
			@NotBlank(message = "Hostler email is required") @Email(message = "Hostler email must be a valid email address") String hostlertEmail,
			@NotBlank(message = "Hostler name is required") @Size(min = 2, max = 50, message = "Hostler name must be between 2 and 50 characters") String hostlerName,
			@NotBlank(message = "Hostel name is required") @Size(min = 2, max = 50, message = "Hostel name must be between 2 and 50 characters") String hostelName,
			@NotBlank(message = "Hostler room number is required") String hostlerRoomNo,
			@NotBlank(message = "Month  is required") String month,
			@NotBlank(message = "PaymentStatus  is required") String paymentStatus,
			@NotBlank(message = "Amount to pay  is required") String amountToPay, Hostel hostel) {
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
	public HostlerFeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
}

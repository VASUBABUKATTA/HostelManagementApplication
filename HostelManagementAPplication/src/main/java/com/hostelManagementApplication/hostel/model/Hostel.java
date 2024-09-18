package com.hostelManagementApplication.hostel.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "hostel")
public class Hostel {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    private String hostelName;
	    private String address;

	    @OneToMany(mappedBy = "hostel")
	    private List<Hostler> hostlers;
	    
	    @OneToMany(mappedBy = "hostel")
	    private List<HostlerFee> hostlerFees;
	    
    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Hostler> getHostlers() {
        return hostlers;
    }

    public void setHostlers(List<Hostler> hostlers) {
        this.hostlers = hostlers;
    }

	public Hostel(long id, String hostelName, String address
			, List<Hostler> hostlers , List<HostlerFee> hostlerFees
			) {
		super();
		this.id = id;
		this.hostelName = hostelName;
		this.address = address;
		this.hostlers = hostlers;
		this.hostlerFees = hostlerFees;
	}

	public List<HostlerFee> getHostlerFees() {
		return hostlerFees;
	}

	public void setHostlerFees(List<HostlerFee> hostlerFees) {
		this.hostlerFees = hostlerFees;
	}

	public Hostel() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}

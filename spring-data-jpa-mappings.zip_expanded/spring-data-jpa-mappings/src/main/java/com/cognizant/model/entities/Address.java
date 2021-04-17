package com.cognizant.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@Column(name = "address_id")
	private int addressId;
	private String state;
	private String city;
	
	@JoinColumn(name = "emp_id")
	@OneToOne
	private Employee empIdLink;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", state=" + state + ", city=" + city + "]";
	}

	public Employee getEmpIdLink() {
		return empIdLink;
	}

	public void setEmpIdLink(Employee empIdLink) {
		this.empIdLink = empIdLink;
	}

	

	

	
	
}

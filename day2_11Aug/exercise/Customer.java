package com.exercise;

public class Customer {
	

	  private String customerName;
	  private String planType;
	  private String location ;
	  private float planAmount;
	  
	  
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String planType, String location, float planAmount) {
		super();
		this.customerName = customerName;
		this.planType = planType;
		this.location = location;
		this.planAmount = planAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(float planAmount) {
		this.planAmount = planAmount;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", planType=" + planType + ", location=" + location
				+ ", planAmount=" + planAmount + "]";
	}
	
	  
	  

}

package com.mybean;
import javax.annotation.Resource;

public class ServicePlan {
	private String planName;
	private String validityDays;
	private String price;
	
	@Resource
	private MyDbInfo myDbInfo;
	
	public MyDbInfo getMyDbInfo() {
		return myDbInfo;
	}
	public void setMyDbInfo(MyDbInfo myDbInfo) {
		this.myDbInfo = myDbInfo;
	}
	public ServicePlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getValidityDays() {
		return validityDays;
	}
	public void setValidityDays(String validityDays) {
		this.validityDays = validityDays;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ServicePlan [planName=" + planName + ", validityDays=" + validityDays + ", price=" + price + "]";
	}
	

}

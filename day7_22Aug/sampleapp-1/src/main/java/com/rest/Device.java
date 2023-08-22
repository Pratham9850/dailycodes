package com.rest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="deviceData")
public class Device {
	
		@Id
	 	private int deviceId;
	    private String deviceName;
	    private int no_of_rent_days;
	    private String technician_incharge;
		public Device(int deviceId, String deviceName, int no_of_rent_days, String technician_incharge) {
			super();
			this.deviceId = deviceId;
			this.deviceName = deviceName;
			this.no_of_rent_days = no_of_rent_days;
			this.technician_incharge = technician_incharge;
		}
		public Device() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getDeviceId() {
			return deviceId;
		}
		public void setDeviceId(int deviceId) {
			this.deviceId = deviceId;
		}
		public String getDeviceName() {
			return deviceName;
		}
		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}
		public int getNo_of_rent_days() {
			return no_of_rent_days;
		}
		public void setNo_of_rent_days(int no_of_rent_days) {
			this.no_of_rent_days = no_of_rent_days;
		}
		public String getTechnician_incharge() {
			return technician_incharge;
		}
		public void setTechnician_incharge(String technician_incharge) {
			this.technician_incharge = technician_incharge;
		}
		@Override
		public String toString() {
			return "Device [deviceId=" + deviceId + ", deviceName=" + deviceName + ", no_of_rent_days="
					+ no_of_rent_days + ", technician_incharge=" + technician_incharge + "]";
		}
	    
}

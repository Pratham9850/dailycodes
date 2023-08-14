package com.collecterandCollectors;

public class Department {
	
	private String departmentName;
    private String location ;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", location=" + location + "]";
	}
	public Department(String departmentName, String location) {
		super();
		this.departmentName = departmentName;
		this.location = location;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}

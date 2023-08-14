package com.collecterandCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("narendra", "Modi", new Department("Sales", "Mumbai"), new Designation("Manager")));
	        employees.add(new Employee("Pappu", "Andhi", new Department("HR", "Pune"), new Designation("Analyst")));
	        employees.add(new Employee("Soniya", "Andhi", new Department("Sales", "Mumbai"), new Designation("Manager")));

	        List<Employee> salesManagers = employees.stream()
	                .filter(employee -> "Sales".equals(employee.getDepartment().getDepartmentName())
	                        && "Manager".equals(employee.getDesignation().getDesignation_type()))
	                .collect(Collectors.toList());
	        
	        System.out.println("List of sales manager:" + salesManagers);
	        
	        List<Employee> mumbaiEmployees = employees.stream()
	                .filter(employee -> "Mumbai".equals(employee.getDepartment().getLocation()))
	                .collect(Collectors.toList());
	        System.out.println("List of Mumbai Employees" + mumbaiEmployees);
	        
	        List<String> combinedNames = employees.stream()
	                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
	                .collect(Collectors.toList());
	        
	        System.out.println("Combined Names: " + combinedNames);

	}

}

package com.collecterandCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Customer> customers = new ArrayList<>();
	        customers.add(new Customer("John", "Doe", "john@example.com", new Location("New York", "NY")));
	        customers.add(new Customer("Jane", "Smith", "jane@example.com", new Location("Los Angeles", "CA")));
	        customers.add(new Customer("Alice", "Johnson", "alice@example.com", new Location("Chicago", "IL")));
	        
	        List<String> details = customers.stream().map((e) -> e.getFirstName() +" "+ e.getLastName()+" "+ e.getLocation().getLocationName()).collect(Collectors.toList());
	        System.out.println(customers);
	}

}

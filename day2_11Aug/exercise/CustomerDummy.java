package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class CustomerDummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer("John","Basic","Hyd",150));
		customerList.add(new Customer("paulo","Basic","brazil",350));
		customerList.add(new Customer("onny","sins","advance",90));
		
		System.out.println("Customers list : ");
		customerList.forEach(System.out::println);
		
		
		customerList.sort((i,j) -> i.getCustomerName().compareTo(j.getCustomerName()));
		
		System.out.println("Customers list : ");
		customerList.forEach(System.out::println);
		
		customerList.removeIf(customer -> customer.getPlanAmount() < 200);
		System.out.println("Customers list : ");
		customerList.forEach(System.out::println);
	}

}

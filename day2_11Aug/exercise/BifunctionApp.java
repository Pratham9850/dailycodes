package com.exercise;

import java.util.function.BinaryOperator;
import java.util.Comparator;
public class BifunctionApp {
	

		

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("John","Basic","Hyd",150);
		Customer customer2 =  new Customer("paulo","Basic","brazil",350);
		Customer customer3 = new Customer("onny","sins","advance",90);

		// TODO Auto-generated method stub

		BinaryOperator<Customer> maxPriceItem = BinaryOperator.maxBy(Comparator.comparing(Customer::getPlanAmount));
		
		 Customer planWithMaxValue = maxPriceItem.apply(customer1, maxPriceItem.apply(customer2,customer3));
	     System.out.println("Plan with maximum value: " + planWithMaxValue.getCustomerName());
	}

}

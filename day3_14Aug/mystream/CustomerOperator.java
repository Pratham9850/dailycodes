package com.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class CustomerOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "Mumbai", "Basic", 2, 1000));
        customers.add(new Customer("Alice", "Delhi", "Premium", 6, 800));
        customers.add(new Customer("Paulo", "Pune", "Advance", 4, 250));
        
        Stream<Customer> stream = customers.stream();
        stream.filter((e) -> e.getPlanRange()>3).forEach(System.out::println);
        
        Stream<Customer> abovefivehundred = customers.stream();
        abovefivehundred.filter((e) -> e.getAmount()>500).forEach(System.out::println);

        Stream<Customer> mumbaiCustomers = customers.stream();
        mumbaiCustomers.filter((e) -> e.getLocation().equalsIgnoreCase("Mumbai")).map((e)-> e.getAmount()+(e.getAmount()*20/100)+" "+ e.getLocation()).forEach(System.out::println);

        
        boolean allPlanRangeAbove300 = customers.stream()
                .allMatch(customer -> customer.getAmount() > 300);

        boolean anyPlanRangeAbove600 = customers.stream()
                .anyMatch(customer -> customer.getAmount() > 600);

        System.out.println("All customers with planRange above 300: " + allPlanRangeAbove300);
       
		System.out.println("Any customers with planRange above 600: " + anyPlanRangeAbove600);
        
	}

}

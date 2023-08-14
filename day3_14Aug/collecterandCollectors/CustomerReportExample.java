package com.collecterandCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerReportExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Customers> customers = new ArrayList<>();
        customers.add(new Customers(1, new Product("Phone", 500.0f, 1, true, "Electronics"), 400.0f, "Card", "Pune"));
        customers.add(new Customers(2, new Product("Laptop", 1200.0f, 1, true, "Electronics"), 1100.0f, "Cash", "Mumbai"));
        customers.add(new Customers(3, new Product("Book", 20.0f, 2, true, "Books"), 30.0f, "Card", "Chennai"));
        customers.add(new Customers(4, new Product("Shirt", 30.0f, 3, true, "Clothing"), 25.0f, "Cash", "Pune"));
        customers.add(new Customers(5, new Product("Shoes", 50.0f, 1, false, "Clothing"), 45.0f, "Card", "Mumbai"));

        Map<String, List<Customers>> customersByLocation = customers.stream()
                .collect(Collectors.groupingBy(Customers::getLocation));
        System.out.println("List of customers as per location: " + customersByLocation);
        
        Map<String, List<Customers>> customersByProduct = customers.stream()
                .collect(Collectors.groupingBy(customer -> customer.getProduct().getProductName()));
        System.out.println("List of customers as per product: " + customersByProduct);
        
        Map<String, List<Customers>> customersByPaymentType = customers.stream()
                .collect(Collectors.groupingBy(Customers::getPayment_type));
        System.out.println("List of customers as per payment_type: " + customersByPaymentType);
        
        
        Map<Object, List<String>> productsByStore = customers.stream()
                .collect(Collectors.groupingBy(customer -> customer.getProduct().getStore_name(),
                        Collectors.mapping(customer -> customer.getProduct().getProductName(), Collectors.toList())));
        System.out.println("List of products as per store_name: " + productsByStore);
        
        Map<Object, Double> avgPriceByStore = customers.stream()
                .collect(Collectors.groupingBy(customer -> customer.getProduct().getStore_name(),
                        Collectors.averagingDouble(customer -> customer.getProduct().getPrice())));
        System.out.println("Average price of products as per Store_name: " + avgPriceByStore);


        
        


	}

}







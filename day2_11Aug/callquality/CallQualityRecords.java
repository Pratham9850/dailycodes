package com.callquality;

import java.io.*;

public class CallQualityRecords {
	
	public void saveCustomer(CallQuality customer)
	{
		 try {
		FileOutputStream fileout=new FileOutputStream(customer.getCustomerName()+".dat");
		 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
		 objectout.writeObject(customer);
		 objectout.flush();
		 objectout.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	
	public void displayCustomer(String name)
	{
		
		try {
			FileInputStream filein =new FileInputStream(name+".dat");
			ObjectInputStream objectin=new ObjectInputStream(filein);
			CallQuality customer =(CallQuality)objectin.readObject();
			
			System.out.println("CallId Name "+customer.getCallId());
			System.out.println("Customer Name "+customer.getCallDuration());
			System.out.println("Customer Name "+customer.getCallQualityGrade());
			System.out.println("Customer Address "+customer.getCustomerName());
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallQuality obj1 = new CallQuality(1,30,"average","peter");
		CallQualityRecords records = new CallQualityRecords();
		records.saveCustomer(obj1);
		records.displayCustomer(obj1.getCustomerName());
		
	
		
	}

}

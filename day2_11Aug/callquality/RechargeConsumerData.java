package com.callquality;

import java.util.ArrayList;
import java.util.function.Function;

public class RechargeConsumerData {
	
	ArrayList<Recharge> itemList = new ArrayList<>();
	
	RechargeConsumerData()
	{
		itemList.add(new Recharge(1,100,"12/01/99"));
		itemList.add(new Recharge(2,200,"12/05/98"));

	}
	
	public void RechargeData(Function<Recharge,Integer> function) {
		for(Recharge i : itemList) {
			System.out.println(function.apply(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RechargeConsumerData obj = new RechargeConsumerData();
		obj.RechargeData((item) -> item.getCustomerId());
		
		

	}

}

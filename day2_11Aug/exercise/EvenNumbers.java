package com.exercise;
import java.util.function.Predicate;
public class EvenNumbers {
	
	public static boolean isEven(int num) {
		return num%2 == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,23,11,19,25,32,16,22};
		
		Predicate<Integer> evenPredicate = EvenNumbers::isEven;
		for (int num:arr) {
			if(evenPredicate.test(num)) {
				System.out.println(num);
			}
		}

	}
	

}

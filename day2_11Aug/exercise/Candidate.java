package com.exercise;

import java.util.function.Predicate;

public class Candidate {
	int [] arr = {12,23,11,19,35,22};
    public void checkAge(int age) {
        if (age > 18) {
            System.out.println("Valid age");
        } else {
            System.out.println("Invalid age");
        }
    }

public void checkAge(Predicate <Integer> c) {
	for(int i = 0; i < arr.length; i++) {
		if(c.test(arr[i])) {
            System.out.println("Valid age");
		}
		else {
			System.out.println("Invalid age");
		}
	}
}

    public static void main(String[] args) {
    	
        Candidate candidate = new Candidate();
        candidate.checkAge((c) -> c>18);
     
//        Predicate<Integer> agePredicate = Candidate::checkAge;
//
//        int[] agearray = {12, 23, 11, 19, 35, 22};
//        
//        for (int age : agearray) {
//            agePredicate.test(age);
//       }
    }
}
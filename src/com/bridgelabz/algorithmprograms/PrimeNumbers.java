package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
public class PrimeNumbers {
	
	private static ArrayList<Integer> printPrimeNumber(int maxLimit) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		for(int i=2;i<=maxLimit;i++) {
			boolean flag = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j == 0) flag = false; 
			}
			if(flag) primeNumbers.add(i);
		}
		return primeNumbers;
	}
	public static void main(String[] args) {
		int maxLimit = 1000;
		System.out.println("Prime numbers in the range 0-"+maxLimit+" are:");
		ArrayList<Integer> primeNumbers = printPrimeNumber(maxLimit);
		for(int i=0;i<primeNumbers.size();i++) {
			System.out.print(primeNumbers.get(i)+" ");
		}
		
	}
}

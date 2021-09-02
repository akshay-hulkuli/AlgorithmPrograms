package com.bridgelabz.algorithmprograms;

import java.util.Scanner;
import java.util.ArrayList;
public class PalindromeAndAnagram {
	
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
	
	private static void findPalindromeAndAnagram(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			int reverse = reverse(list.get(i));
			for(int j=i;j<list.size();j++) {
				if(reverse == list.get(j)) {
					System.out.println("numbers that are both anagram and palindrome : "+list.get(i)+"-"+reverse);
				}
			}
		}
	}
	
	private static int reverse(int number) {
		int sum  =0;
		int remainder =0;
		while(number >0) {
			remainder = number%10;
			sum *= 10;
			sum += remainder;
			number /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int maxLimit = 1000;
		System.out.println("Prime numbers in the range 0-"+maxLimit+" are:");
		ArrayList<Integer> primeNumbers = printPrimeNumber(maxLimit);
		for(int i=0;i<primeNumbers.size();i++) {
			System.out.print(primeNumbers.get(i)+" ");
		}
		
		findPalindromeAndAnagram(primeNumbers);
		
	}
}

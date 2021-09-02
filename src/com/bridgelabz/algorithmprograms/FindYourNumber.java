package com.bridgelabz.algorithmprograms;
import java.util.*;
public class FindYourNumber {
	static Scanner sc = new Scanner(System.in);
	private static int findYourNumber(int number) {
		int low = 0;
		int high = number;
		while(low<=high) {
			int mid = (low+high) / 2;
			System.out.println("Is "+mid+" your answer?");
			if(sc.nextBoolean()) return mid;
			System.out.println("Is it less than "+mid+" ?");
			if(sc.nextBoolean()) high = mid-1;
			else low = mid+1;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int number = Integer.parseInt(args[0]);
		int answer = findYourNumber(number);
		System.out.println("the final answer is : "+answer);
		
		sc.close();
	}
}

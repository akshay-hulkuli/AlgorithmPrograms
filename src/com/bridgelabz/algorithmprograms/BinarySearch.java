package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	
	private static boolean binarySearch(String[] words, String key) {
		int lowerBound = 0;
		int upperBound = words.length-1;
		while(lowerBound<= upperBound) {
			int mid = (lowerBound+upperBound)/2;
			int compareResult = words[mid].compareTo(key);
			if(compareResult == 0) return true;
			else if(compareResult>0) {
				upperBound = mid-1;
			}
			else {
				lowerBound = mid+1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int number = sc.nextInt();
		String[] words = new String[number];
		System.out.println("Enter the words");
		for(int i=0;i<number;i++) {
			words[i] = sc.next();
		}
		Arrays.sort(words);
		System.out.println("Enter word to be searched");
		String key = sc.next();
		
		System.out.println("the word \""+key+"\" is present : "+binarySearch(words,key));
	}
}

package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class InsertionSort {
	
	private static void insertionSort(String[] words) {
		for(int i=1;i<words.length;i++) {
			for(int j=i;j>0;j--) {
				if(words[j-1].compareTo(words[j])>0) {
					String temp = words[j-1];
					words[j-1] = words[j];
					words[j] = temp;
				}
			}
		}
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
		System.out.println("Unsorted list :");
		for(int i=0;i<number;i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println();
		insertionSort(words);
		System.out.println("After sorting the list :");
		for(int i=0;i<number;i++) {
			System.out.print(words[i]+" ");
		}
	}
}

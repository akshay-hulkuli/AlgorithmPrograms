package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class BubbleSort {
	
	private static void bubbleSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int number = sc.nextInt();
		int[] words = new int[number];
		System.out.println("Enter the elements");
		for(int i=0;i<number;i++) {
			words[i] = sc.nextInt();
		}
		System.out.println("Unsorted list :");
		for(int i=0;i<number;i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println();
		bubbleSort(words);
		System.out.println("After sorting the list :");
		for(int i=0;i<number;i++) {
			System.out.print(words[i]+" ");
		}
	}
}

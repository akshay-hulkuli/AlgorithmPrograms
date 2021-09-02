package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class MergeSort {
	
	private static void mergeSort(String[] words, int lowerBound, int upperBound){
		if(lowerBound<upperBound) {
			int mid = lowerBound + (upperBound-lowerBound)/2;
			mergeSort(words,lowerBound,mid); 
			mergeSort(words,mid+1,upperBound);
			merge(words,lowerBound,mid,upperBound);
		}
	}
	
	private static void merge(String[] words,int lowerBound, int mid, int upperBound) {
		int size1 = mid-lowerBound+1;
		int size2 = upperBound - mid;
		
		String[] leftArray = new String[size1];
		String[] rightArray = new String[size2];
		
		for(int i=0;i<size1;i++) {
			leftArray[i] = words[lowerBound+i];
		}
		for(int j=0;j<size2;j++) {
			rightArray[j] = words[mid+j+1];
		}
		
		int i=0; int j=0;
		int k=lowerBound;
		while(i<size1&&j<size2) {
			if(leftArray[i].compareTo(rightArray[j])<= 0) {
				words[k] = leftArray[i];
				k++; i++;
			}
			else {
				words[k] = rightArray[j];
				k++; j++;
			}
		}
		while(i<size1) {
			words[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<size2) {
			words[k] = rightArray[j];
			j++;
			k++;
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
		mergeSort(words,0,words.length-1);
		System.out.println("After sorting the list :");
		for(int i=0;i<number;i++) {
			System.out.print(words[i]+" ");
		}
	}
}

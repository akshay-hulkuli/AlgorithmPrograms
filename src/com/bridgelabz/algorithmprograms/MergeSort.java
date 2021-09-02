package com.bridgelabz.algorithmprograms;

import java.util.*;

public class MergeSort {
	
	private static <T extends Comparable>void mergeSort(T[] words, int lowerBound, int upperBound){
		if(lowerBound<upperBound) {
			int mid = (lowerBound + upperBound)/2;
			mergeSort(words,lowerBound,mid); 
			mergeSort(words,mid+1,upperBound);
			merge(words,lowerBound,mid,upperBound);
		}
	}
	
	private static <T extends Comparable>void merge(T[] words,int lowerBound, int mid, int upperBound) {
		int size1 = mid-lowerBound+1;
		int size2 = upperBound - mid;
		
		ArrayList<T> leftArray = new ArrayList<T>(size1);
		ArrayList<T> rightArray = new ArrayList<T>(size2);
		
		
		for(int i=0;i<size1;i++) {
			leftArray.add(i,words[lowerBound+i]);
		}
		for(int j=0;j<size2;j++) {
			rightArray.add(j,words[mid+j+1]);
		}
		
		int i=0; int j=0;
		int k=lowerBound;
		while(i<size1&&j<size2) {
			if(leftArray.get(i).compareTo(rightArray.get(j))<= 0) {
				words[k] = leftArray.get(i);
				k++; i++;
			}
			else {
				words[k] = rightArray.get(j);
				k++; j++;
			}
		}
		while(i<size1) {
			words[k] = leftArray.get(i);
			i++;
			k++;
		}
		while(j<size2) {
			words[k] = rightArray.get(j);
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

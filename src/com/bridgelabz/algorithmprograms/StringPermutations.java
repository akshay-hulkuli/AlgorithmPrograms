package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.*;

public class StringPermutations {
	private static ArrayList<String> permutations1 = new ArrayList<String>();
	private static ArrayList<String> permutations2 = new ArrayList<String>();
	private static void findPermutationsRecursively(String current , String ans) {
		if(current.length() == 0) {
			permutations1.add(ans);
		}
		for(int i=0; i<current.length();i++) {
			char ch = current.charAt(i);
			String remainingChars = current.substring(0,i)+current.substring(i+1);
			findPermutationsRecursively(remainingChars,ans+ch);
		}
	}
	
	private static void findPermutationIteratively(String current) 
	{
			int max = fact(current.length());
			int divisor;
			
			for(int i=0;i<max;i++) {
				StringBuilder str = new StringBuilder(current);
				divisor = current.length();
				StringBuilder ans = new StringBuilder();
				int k = i;
				for(int j= divisor;j>0;j--) {
					int index = k%j;
					k = k/j;
					ans.append(str.charAt(index));
					str.deleteCharAt(index);
				}
				permutations2.add(ans.toString());
			}
	
	}
	private static int fact(int n) {
		if(n==0) return 1;
		else return n*fact(n-1);
	}
		
	public static void main(String[] args) {
		String inputString = "ABC";
		findPermutationsRecursively(inputString, "");
		findPermutationIteratively(inputString);
		System.out.println(permutations1);
		System.out.println(permutations2);
		Collections.sort(permutations2);
		Collections.sort(permutations1);
		System.out.println("Are they equal : "+permutations2.equals(permutations1));
	}

}




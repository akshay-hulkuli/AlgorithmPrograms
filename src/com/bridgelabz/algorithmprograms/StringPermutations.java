package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;

public class StringPermutations {
	private static ArrayList<String> permutations = new ArrayList<String>();
	
	private static void findPermutationsRecursively(String current , String ans) {
		if(current.length() == 0) {
			permutations.add(ans);
		}
		for(int i=0; i<current.length();i++) {
			char ch = current.charAt(i);
			String remainingChars = current.substring(0,i)+current.substring(i+1);
			findPermutationsRecursively(remainingChars,ans+ch);
		}
	}
	
	private static void findPermutationsIteratively(String str) {
		
	}
	public static void main(String[] args) {
		String inputString = "ABC";
		findPermutationsRecursively(inputString, "");
		System.out.println(permutations);
	}

}

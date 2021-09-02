package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

public class TestAnagram {
	
	private static boolean checkAnagram(char[] string1, char[] string2) {
		if(string1.equals(string2)) return false;
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		for(int i=0;i<string1.length;i++) {
			if(string1[i] != string2[i]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First string");
		String string1 = sc.next();
		System.out.println("Enter the Second string");
		String string2 = sc.next();
		char[] stringArray1 = string1.toCharArray();
		char[] stringArray2 = string2.toCharArray();
		System.out.println("Are they anagrams each other : "+ checkAnagram(stringArray1, stringArray2));
		sc.close();
	}

}

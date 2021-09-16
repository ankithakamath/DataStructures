package com.yml.data;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
	
	static String str1, str2;
	static Scanner r = new Scanner(System.in);

	public static void anagram() {
		System.out.println("Enter the first string");
		str1 = r.next();
		System.out.println("Enter the second string");
		str2 = r.next();

		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 != len2) {
			System.out.println("They cannot be an anagram");
		} else {
			char arr1[] = str1.toCharArray();
			char arr2[] = str2.toCharArray();

			arr1 = sort(arr1);
			arr2 = sort(arr2);

			if (Arrays.equals(arr1, arr2)) {
				System.out.println("They are an Anagram");
			} else {
				System.out.println("They are not an anagram");
			}
		}
	}

	private static char[] sort(char[] arr) {

		char temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;

	}
	public static void main(String[] args) {
		Anagram.anagram();

	}
	
}
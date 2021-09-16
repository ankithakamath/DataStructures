package com.yml.data;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;


public class BinarySearch {
	

	public static void main(String[] args) {
		
		BinarySearch.readFile();
}
	static Scanner r = new Scanner(System.in);

	
	public static void readFile() {
		String key = getKey();

		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/ankithakamath/Desktop/assignments/DataStructures/src/com/yml/data/Binary.txt"));
			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next() + " ";
			}
			String[] array = whole.split(" ");
			sort(array, key);

			x.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	
	private static String getKey() {

		System.out.println("Enter the key to search");
		String key = r.nextLine();

		return key;

	}

	
	private static void sort(String[] a, String key) {

		System.out.println("UnSorted array");

		for (String string : a) {
			System.out.println(string);

		}
		int len = a.length;
		String temp;

		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}

		System.out.println("Sorted array");

		for (String string : a) {
			System.out.println(string);

		}
		binarysearch(a, key);

	}

	
	private static void binarysearch(String[] a, String key) {
		int left = 0, right = a.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;

			if (key.compareTo(a[mid]) == 0) {
				System.out.println(key + " found at position " + (mid + 1));
				System.exit(0);
			}
			if (key.compareTo(a[mid]) > 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		System.out.println("Not found");

	}

}
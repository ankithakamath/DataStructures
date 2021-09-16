package com.yml.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.yml.data.Generic;


public class BinarySearchMain {
public static void main(String[] args) {
		
		String[] arr1= {"My","is","name","ankitha"};
		Integer[] arr2= {3,6,1,90,45,65,76,34};
		Float[] arr3= {12.1f,65.4f,78f,54.8f,65.4f,7.3f,98f};
		
		Generic.bubbleSort(arr1);
		Generic.insertionSort(arr2);
		Generic.bubbleSort(arr3);
		Integer a=Generic.getKey();
		Integer b[]=Generic.getInput();
		Generic.binarySearch(b,a);
		
	}
	
	private static Integer getKey() {
		Scanner r = new Scanner(System.in);

		System.out.println("Enter the key to search");
		Integer key = r.nextInt();

		return key;

	}
	
	private static <T> Integer[] getInput() {
		Scanner x;
		try {
			x = new Scanner(
					new File("/Users/ankithakamath/Desktop/assignments/DataStructures/src/com/yml/data/Binary.txt"));

			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next()+" ";
			}
			String[] array = whole.split(" ");
			Integer[] a=new Integer[array.length];
			for(int i=0;i<array.length;i++) {
				a[i]=Integer.parseInt(array[i]);
			}
			x.close();
			return a;

			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return null;
		
	}
}

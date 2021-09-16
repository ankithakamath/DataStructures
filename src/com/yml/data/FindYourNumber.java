package com.yml.data;

import java.util.Scanner;

public class FindYourNumber {


	static int num;
	static Scanner r = new Scanner(System.in);
   
	public static void getInput(int N) {
		  N =r.nextInt();
		System.out.println("Think of a number between 0 and " + (N - 1));
		num = r.nextInt();
		find(0, N - 1);
	}

	private static void find(int lower, int higher) {
		if (lower == higher) {
			System.out.println("Your number is " + lower);
			System.out.println("Intermediary numbers are " + (lower - 1) + " and " + (lower + 1));
			return;
		}

		int mid = (lower + higher) / 2;
		String ch;
		System.out.println("Is your number between " + lower + " and " + mid);
		ch = r.next();
		if (ch.equalsIgnoreCase("yes")) {
			find(lower, mid);
		} else {
			find(mid + 1, higher);
		}

	}
	public static void main(String[] args) {
		FindYourNumber.getInput(num);

	}
}

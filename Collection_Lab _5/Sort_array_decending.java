package com.example.sort1;

import java.util.Scanner;

public class Sort_array_decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, temp;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements:");
		for (i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The sorted elements are:");
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}

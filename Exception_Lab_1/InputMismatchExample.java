package test.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int number = 0;

	        try {
	            System.out.print("Enter a number: ");
	            number = scanner.nextInt();
	            System.out.println("You entered: " + number);
	        } catch (InputMismatchException e) {
	            System.out.println("Input mismatch exception occurred: Please enter a valid integer number.");
	            scanner.nextLine(); // clear the input buffer
	        }

	        scanner.close();
	}

}

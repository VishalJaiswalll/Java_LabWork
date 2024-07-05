package test.example;

import java.util.Scanner;
public class OddNumberExceptionExample {
	
public static void check(int a) {
		
		if (a%2!=0) {
			throw new ArithmeticException ("Odd number entered! Please enter an even number.");
			
		}
		
		else {
			System.out.println("It's even number so welcome!!");
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int Num =sc.nextInt();
		check(Num);
	}

}



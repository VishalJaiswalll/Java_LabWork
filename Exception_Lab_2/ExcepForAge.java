package test.example;

import java.util.Scanner;

public class ExcepForAge {
	
	public  void check(int age)
	{
		
		if(age<=0) {
			throw new ArithmeticException("Age cannot be zero or negative. Please enter a valid age.");
		
		}
		else
		{
			System.out.println("Thank you for providing your age: " + age);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcepForAge obj=new ExcepForAge();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		obj.check(age);
		
	}

}

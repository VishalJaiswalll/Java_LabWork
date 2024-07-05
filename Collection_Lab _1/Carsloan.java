package test.example;

import java.util.Scanner;

public class Carsloan implements LoanCal {
    
    public double princiAmt, loanAmount;
    public double roi = 4.5;
    public int years;
    Scanner sc = new Scanner(System.in);
     
    public void acceptPrinciAmt() {
        System.out.println("Enter principal amount:");
        princiAmt = sc.nextDouble();
        System.out.println("Enter no of years:");
        years = sc.nextInt();
    }
     
    public void calculate() {
        loanAmount = (princiAmt * years * roi) / 100;
        System.out.println("Your interest for said years are: " + loanAmount);
    }
    
    public static void main(String[] args) {
        Carsloan obj = new Carsloan();
        obj.acceptPrinciAmt();
        obj.calculate();
    }
}

	
		
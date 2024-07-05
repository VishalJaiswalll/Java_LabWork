package com.example.sort1;

import java.util.Scanner;

public class sort_smallest_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,temp; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		
	    System.out.println("Enter the elements:");   
		for(i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("The sorted elements are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		int secondSmallest = a[1];
        int secondLargest = a[n - 2];

        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Second largest element: " + secondLargest);

	}

}

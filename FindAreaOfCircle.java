package com.prabha.FindAreaOfCircle;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double radius=sc.nextDouble();
		
		double area = Math.PI*(radius*radius);
		System.out.println("The area of circle is : "+area);
		
		double circumference = Math.PI*2*radius;
		System.out.println("The circumference of circle is : "+circumference);
	}

}

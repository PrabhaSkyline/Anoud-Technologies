package com.prabha.FindAreaOfSquare;

import java.util.Scanner;

public class FindAreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter side of square : ");
		Scanner sc = new Scanner(System.in);
		double side=sc.nextDouble();
		double area = side*side;
		System.out.println("Area of square is : "+area);
	}

}

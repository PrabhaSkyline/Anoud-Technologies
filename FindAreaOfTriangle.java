package com.prabha.FindAreaOfTriangle;

import java.util.Scanner;

public class FindAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width of the triangle : ");
		double width=sc.nextDouble();
		
		System.out.print("Enter the height of the triangle : ");
		double height=sc.nextDouble();
		
		double area = (width*height)/2;
		System.out.println("Area of square is : "+area);
	}

}

package com.prabha.FindAreaOfRectangle;

import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of Rectangle : ");
		double legnth = sc.nextDouble();
		System.out.print("Enter the width of Rectangle : ");
		double width = sc.nextDouble();
		
		double area =legnth*width;
		System.out.println("Enter the width of Rectangle : "+area);
	}
}

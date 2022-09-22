package com.prabha.AddTwoNumbers;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number : ");
		int fnum= sc.nextInt();
		System.out.print("enter the Scond number : ");
		int snum= sc.nextInt();
		int add=fnum+snum;
		System.out.println("The addition value is : " + add);
	}

}

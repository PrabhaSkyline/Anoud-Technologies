package com.prabha.multiply;

import java.util.Scanner;

public class MultiplyTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int fnum=23; int snum=43; int multi=fnum*snum; System.out.println(add);
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number : ");
		int fnum= sc.nextInt();
		System.out.print("enter the Scond number : ");
		int snum= sc.nextInt();
		int multi=fnum*snum;
		System.out.println(multi);
	}

}

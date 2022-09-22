package com.prabha.ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int reverseNum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("input your number and press enter : ");
		num =sc.nextInt();
		while(num!=0)
		{
			reverseNum = reverseNum*10;
			reverseNum = reverseNum+num%10;
			num = num/10;
		}
		System.out.println("reverse of input number is : "+reverseNum);
	}

}

package com.prabha.CastingData;

public class CastingData {
	public static void main(String args[]) {
	byte a=10;
	int b=a;
	// byte c=b; can't accept - bcos lower type cannot be put in higher
	byte d =(byte)a;
	System.out.println(d);
	
	byte x=23;
	byte y=45;
//	byte sum=x*y; error is thrown bcos when the two bytes used in arthmetic operation, the result will be integer
	} 
}

package com.prabha.PyramidExample;

public class PyramidExample {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term=6;
		for(int i=1;i<=term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

}

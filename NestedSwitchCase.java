package com.prabha.NestedSwitchCase;

public class NestedSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tech =2;
		int course=2;
		switch (tech) {
		case 1:{
			System.out.println("PYTHON");
			break;
		}
		case 2:
			switch (course) {
				case 1:{
					System.out.println("J2EE");
					break;
				}
				case 2:{
					System.out.println("Advance Java");
					break;
				}
			}
		}
	}

}

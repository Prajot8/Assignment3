package com.nissan.app;

public class Question2 {
	/*
	 * b. Create an array having 10 elements. 
	 * Try to print the element in the 11th position. Catch the appropriate exception.
	 */
	public static void main(String[] args) {
		
		try {
		int intArray[]= new int [] {1,2,3,4,5,6,7,8,9,10};
		displayArrayElement(intArray);
	}catch(Exception e) {
		System.out.println("Invalid input.");
	}
	}
	private static void displayArrayElement(int[] intArray) {
		try {
		for(int i=0;i<=intArray.length;i++) {
			System.out.println(i+"th index value : "+intArray[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You have try to access index greater than array size.");
		}
	}

}

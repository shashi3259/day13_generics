package com.bridgelab.java_generics;

public class UC1_PrintArray {
	
	public static void toPrint(Integer []inputArray) {
		for (int element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static void toPrint(Double []inputArray) {
		for (double element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static void toPrint(Character []inputArray) {
		for (char element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []intArray = {1,2,3,4,5};
		Double []doubleArray = {1.1,2.5,3.5,4.0,5.3};
		Character []charArray = {'A','B','C','D'};
		
		UC1_PrintArray.toPrint(charArray);
		UC1_PrintArray.toPrint(doubleArray);
		UC1_PrintArray.toPrint(intArray);
		

	}

}

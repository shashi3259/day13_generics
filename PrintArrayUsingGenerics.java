package com.bridgelab.java_generics;

public class PrintArrayUsingGenerics {

	public static <E> void toPrint(E []inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []intArray = {1,2,3,4,5};
		Double []doubleArray = {1.1,2.5,3.5,4.0,5.3};
		Character []charArray = {'A','B','C','D'};

		PrintArrayUsingGenerics.toPrint(charArray);
		PrintArrayUsingGenerics.toPrint(doubleArray);
		PrintArrayUsingGenerics.toPrint(intArray);

	}

}


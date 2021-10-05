package com.bridgelab.java_generics;

public class R2_GenericClassPrintArray<T> {
	
	private T[] inputArray;
	
	public R2_GenericClassPrintArray(T[] Array) {
		Array = inputArray;
	}
	
	public void toPrint() {
		R2_GenericClassPrintArray.toPrint(this.inputArray);
	}

	private static <E> void toPrint(E[] inputArray) {
		// TODO Auto-generated method stub
		for(E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray = {1,2,3,4,5};
		Character[] charArray = {'A','B','C','D'};
		Double[] doubleArray = {1.2,2.5,3.5,4.3,5.0};
		
		R2_GenericClassPrintArray.toPrint(charArray);	
		R2_GenericClassPrintArray.toPrint(doubleArray);
		R2_GenericClassPrintArray.toPrint(intArray);
	}

}

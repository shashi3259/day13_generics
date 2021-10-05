package com.bridgelab.java_generics;

public class UC1_FindMaxInt {

	public static Integer testMax(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max)> 0) {
			max = y;
		}
		if(z.compareTo(max)> 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	private static void printMax(Integer x, Integer y, Integer z, Integer max) {
		// TODO Auto-generated method stub
		System.out.printf("Max of %s, %s and %s\n" , x, y, z + " is "+ max);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 3, y = 12, z = 5;
		
		UC1_FindMaxInt.testMax(x, y, z);

	}

}

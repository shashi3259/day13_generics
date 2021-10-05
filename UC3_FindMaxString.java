package com.bridgelab.java_generics;

public class UC3_FindMaxString {

	public static String testMax(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max)> 0) {
			max = y;
		}
		if(z.compareTo(max)> 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	private static void printMax(String x, String y, String z,String max) {
		// TODO Auto-generated method stub
		System.out.printf("Max of %s, %s and %s\n" , x, y, z + " is "+ max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Apple", y = "cricket", z ="Match";
		
		UC3_FindMaxString.testMax(x, y, z);

	}

}

package com.bridgelab.java_generics;

public class UC3_FindMaxFloat {
	public static Float testMax(Float x, Float y,Float z) {
		Float max = x;
		if(y.compareTo(max)> 0) {
			max = y;
		}
		if(z.compareTo(max)> 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	private static void printMax(Float x, Float y,Float z, Float max) {
		// TODO Auto-generated method stub
		System.out.printf("Max of %s, %s and %s\n" , x, y, z + " is "+ max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float x=66.6f, y=8.8f, z=7.9f;
		
		UC3_FindMaxFloat.testMax(x, y, z);

	}

}

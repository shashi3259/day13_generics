package com.bridgelab.java_generics;

public class R1_MaximumTestUsingGenerics<T extends Comparable<T>> {
	T x, y, z;
	public R1_MaximumTestUsingGenerics(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T maximum() {
		return R1_MaximumTestUsingGenerics.maximum(x , y, z);
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) > 0){
			max = y;
		}
		if(z.compareTo(max) > 0){
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s, %s and %s\n" , x, y, z+ " is "+ max);
		
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Integer x = 3, y = 115, z = 5;
			Float xF = 66.6f, yF = 8.8f, zF = 7.9f;
			String xS = "Apple" , yS = "cricket", zS = "match";
			
			R1_MaximumTestUsingGenerics.maximum(x, y, z);
			R1_MaximumTestUsingGenerics.maximum(xF, yF, zF);
			R1_MaximumTestUsingGenerics.maximum(xS, yS, zS);
			
			
			
	}

}

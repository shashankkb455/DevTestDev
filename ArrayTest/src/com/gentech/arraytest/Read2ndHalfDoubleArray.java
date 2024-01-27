package com.gentech.arraytest;

public class Read2ndHalfDoubleArray {

	public static void main(String[] args) {
		double arr[]= {1.2,2.3,4.9,3.5,4.5,5.6,7.8};
		for(int i=arr.length/2;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}

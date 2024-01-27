package com.gentech.arraytest;
class Summm
{
	int sumArray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum= sum+arr[i];
		}
		return sum;
	}
}
public class SumofNum {

	public static void main(String[] args) {
		Summm s= new Summm();
		int ar[]= {1,2,3,4};
		int p=s.sumArray(ar);
		System.out.println(p);
		
		

	}

}
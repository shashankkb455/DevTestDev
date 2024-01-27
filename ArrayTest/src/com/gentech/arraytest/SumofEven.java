package com.gentech.arraytest;

class Sum1 
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

	public class SumofEven {

		public static void main(String[] args) {
			Sum s= new Sum();
			int ar[]= {1,2,3,4};
			int p=s.sumArray(ar);
			System.out.println(p);
			
			

		}

	}
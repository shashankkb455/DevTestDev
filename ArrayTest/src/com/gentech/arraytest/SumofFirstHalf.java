package com.gentech.arraytest;

public class SumofFirstHalf {

	public static void main(String[] args) {
		int arr[]= {10,20,30,4,5,7};
		int sum=0;
		for(int i=0;i<arr.length/2;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);

	}

}

//sum of array
class Sum
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

public class SumOfArray {

	public static void main(String[] args) {
		Sum s= new Sum();
		int ar[]= {1,2,3,4};
		int p=s.sumArray(ar);
		System.out.println(p);
		
		

	}

}

//print second half
class Second
{
	double[] Sec(double arr[])
	{
		int k=0;
		double arrhalf[]=new double[arr.length];
		for(int i=arr.length/2;i<arr.length;i++)
		{
			arrhalf[k]=arr[i];
			k++;
		}
		return arrhalf;
	}
}

public class SecondHalf {

	public static void main(String[] args) {
		Second s= new Second();
		double array[]= {1.1,2.2,3.3,4.4,5.5,6.6};
		double res[]= s.Sec(array);
		for(int i=0; i < array.length/2; i++)
		
	        System.out.print(res[i]+" ");
        
	     

}
}
//sum first rowclass SumFirst
{
	int FirstRow(int arr[][])
	{
	int sum=0;	

			for(int j=0;j<arr[0].length;j++)
			{
			   sum = sum+arr[0][j];
	}
		return sum;
}
}

public class SumFirstRow {

	public static void main(String[] args) {
		
		SumFirst s= new SumFirst();
		int sum1[][]={{1,2,3},{4,5,6},{7,8,9}}; 
		int p=s.FirstRow(sum1);
		System.out.println(p);
		

	}

}
//ElementsDivBy1To200
class Elements
{
	int [] Elements1()
	{
		
		int count=0;
		for(int i=0;i<=200;i++)
		{
			if(i%2==0 && i%4==0 && i%6==0)
			{
				count++;
			}
		}
		int a[]= new int[count];
		int k=0;
		int res[]= new int[count];
		for(int j=0;j<=200;j++)
		{
			if(res[j]%2==0 && res[j]%4==0 && res[j]%6==0)
			{
				a[k]=res[j];
			}
		}
		return a;
	}
}

public class ElementsDivBy1To200 {
	public static void main(String args[])
	{
		Elements e= new Elements();
		int result[]= e.Elements1();
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

}
public class TwoDimentionArray {

	void reverseMatrix(char ch[][]) {
		for(int row = ch.length - 1; row >= 0; row--) {
			for(int col = ch[0].length - 1; col >= 0; col--) {
				System.out.print(ch[row][col]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		char ch[][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		
		TwoDimentionArray twoDArray = new TwoDimentionArray();
		twoDArray.reverseMatrix(ch);
		

	}

}

public class Cube {
	int [] cube()
	{
		int k=0;
		int res[]= new int[10];
		for(int i=1;i<=10;i++)
		{
			res[k]= i*i*i;
			k++;
		}
		return res;
	}

	public static void main(String[] args) {
		Cube c= new Cube();
		
		
		int m[]=c.cube();
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}

	}

}
class Rev
{
	int[] revMatrix(int x[])
	{
		int arr[]= new int[x.length];
		int k=0;
		for(int i=x.length - 1; i>=0 ;i--)
		{
			arr[k]=x[i];
			k++;
		}
		
		
		return arr;
	}
}

public class ArrayReverse {

	public static void main(String[] args) {
		Rev r= new Rev();
		int ar[]= {1,2,3,4};
		int arr2[]={4,2,5,7,9};
		int res[] = r.revMatrix(ar);
		for(int i =0; i < ar.length; i++)
		{
        System.out.println(res[i]);
		}
		
		int s[]=r.revMatrix(arr2);
		
		
		System.out.println("==============================");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
        
	}

}
class Odd {
    int[] sum() {
        int res[] = new int[10]; 
        int k = 0;
        int arr[] = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1; 
            if (arr[i] % 2 == 1) {
                res[k] = arr[i];
                k++;
            }
        }

        return res;
    }
}

public class Oddfrom1to20 {
    public static void main(String[] args) {
        Odd o = new Odd();
        int[] result = o.sum();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
package com.gentech.arraytest;

public class ReadArrayDiagonally {


		public static void main(String[] args) {
			int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
			int leftdiagonal=0, rightdiagonal=matrix.length-1;
			for(int i=0;i<matrix.length;i++) {
				for(int j=0;j<matrix[0].length;j++) {
					if(matrix[leftdiagonal][j]==matrix[i][j]) {
						System.out.print(matrix[leftdiagonal][j]+" ");
					}
					else if(matrix[rightdiagonal][j]==matrix[i][j]) {
						System.out.print(matrix[rightdiagonal][j]+" ");
					}
					else {
						System.out.print("0 ");
						
					}
					leftdiagonal=leftdiagonal+1;
					
					rightdiagonal=rightdiagonal-1;
					
				}
				leftdiagonal=0;
				rightdiagonal=matrix.length-1;
				System.out.println(" ");
			}

		}

	


	}



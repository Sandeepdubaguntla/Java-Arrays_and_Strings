package TwoDimensionalArraysMatrix;

import java.util.Scanner;

public class SumOfSecondaryDiagonalInAMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Rows: ");
		int row=sc.nextInt();
		System.out.println("Enter the no of Cols: ");
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		
		System.out.println("Enter "+(row*col)+" Elements into the Matrix :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				if(i + j == a.length-1)
					sum=sum+a[i][j];
			}
		}
		System.out.println("The Sum of Secondary Diagonal Elements are :" +sum);
		
		sc.close();
	}
}

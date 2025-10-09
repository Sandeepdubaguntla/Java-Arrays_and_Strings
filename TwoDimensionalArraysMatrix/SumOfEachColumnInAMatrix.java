package TwoDimensionalArraysMatrix;

import java.util.Scanner;

public class SumOfEachColumnInAMatrix {
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
	for(int i=0;i<col;i++) {
		int sum=0;
		for(int j=0;j<row;j++) {
			
			sum=sum + a[j][i];
		}
		System.out.println("Sum of Column "+(i+1)+" in the matrix is :"+sum);
	}
	
	sc.close();
	}
}


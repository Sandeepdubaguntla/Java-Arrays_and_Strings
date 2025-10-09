package TwoDimensionalArraysMatrix;

import java.util.Scanner;

public class IdentityMatrixOrNot {
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
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		boolean identityMatrix=true;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j && a[i][j] != 1 || i!=j && a[i][j] != 0) {
					identityMatrix=false;
				}
			}
		}
		if(identityMatrix) {
			System.out.println("Its an Identity Matrix");
		}
		else
			System.out.println("Its not an Identity Matrix");
		sc.close();
	}
}

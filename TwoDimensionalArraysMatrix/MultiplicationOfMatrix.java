package TwoDimensionalArraysMatrix;

import java.util.Scanner;

public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of rows :");
		int row = sc.nextInt();
		System.out.println("Enter the no of Cols :");
		int col = sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][col];
		System.out.println("Enter the "+row*col+" elements into the 1st Matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the "+row*col+" elements into the 2st Matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<col;k++) {
				c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

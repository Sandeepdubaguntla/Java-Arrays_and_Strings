package TwoDimensionalArraysMatrix;

import java.util.Scanner;

public class ReadAndPrintMatrix {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of rows :");
		int row = sc.nextInt();
		System.out.println("Enter the no of Cols :");
		int col = sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter the "+row*col+" elements into the 1st Matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

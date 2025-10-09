package TwoDimensionalArraysMatrix;

import java.util.Scanner;

/*Transpose of a Matrix : All the rows in matrix becomes columns and all the columns in a matrix become rows .
  Example : 
	1 2 3          1 4 7
	4 5 6     to   2 5 8
	7 8 9          3 6 9
 */

public class TransposeOfAmatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int row = sc.nextInt();
		System.out.println("Enter the no of Cols :");
		int col = sc.nextInt();
		int a[][]=new int[row][col];
		int Transpose[][]=new int[col][row];
		System.out.println("Enter the "+row*col+" elements into the 1st Matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Transpose[j][i] = a[i][j];
			}
		}
		System.out.println("The Transpose of the above matrix is :");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(Transpose[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

package TwoDimensionalArraysMatrix;

public class ThreeDMatrix_Example {
	public static void main(String[] args) {
		int  arr[][][] = new int[2][2][2];
		arr[0][0][0] = 1;
		arr[0][0][1] = 2;
		
		arr[0][1][0] = 3;
		arr[0][1][1] = 4;
		
		arr[1][0][0] = 5;
		arr[1][0][1] = 6;
	
		arr[1][1][0] = 7;
		arr[1][1][1] = 8;
		
		//printing matrix 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[i][j][k]+ " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

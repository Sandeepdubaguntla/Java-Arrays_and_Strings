package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateAnArrayMethod2 {

	public static int[] leftRotateMethod2(int arr[],int k) {
		int rotate[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			rotate[i] = arr[(i+k)%arr.length];
		}
		return rotate;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println("Before Left Rotation --> "+Arrays.toString(arr));
		System.out.println("Enter the number of left rotations :");
		int k=sc.nextInt();
		leftRotateMethod2(arr,k);
		System.out.println("After Left Rotation --> "+Arrays.toString(leftRotateMethod2(arr,k)));
		sc.close();
	}
}

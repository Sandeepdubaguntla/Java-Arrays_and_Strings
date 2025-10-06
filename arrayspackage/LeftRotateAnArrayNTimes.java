package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateAnArrayNTimes {

	public static int[] leftRotate(int arr[]) {
		
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1]=temp;
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,4,5,6};
		System.out.println("Enter the number of left rotations :");
		int n=sc.nextInt();
		System.out.println("Before Left Rotation --> "+Arrays.toString(arr));
		for(int i=0;i<n;i++) {
			leftRotate(arr);
			System.out.println("After "+(i+1)+"th rotation --> "+Arrays.toString(arr));
		}
		System.out.println("After Left Rotating "+n+" times --> "+Arrays.toString(arr));
		sc.close();
	}
}

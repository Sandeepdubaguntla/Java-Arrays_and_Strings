package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateAnArrayNTimes {

	public static int[] leftRotate(int arr[]) {
		
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=temp;
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,4,5,6};
		System.out.println("Enter the number of Right rotations :");
		int n=sc.nextInt();
		System.out.println("Before Right Rotation --> "+Arrays.toString(arr));
		for(int i=0;i<n;i++) {
			leftRotate(arr);
			System.out.println("After "+(i+1)+"th rotation --> "+Arrays.toString(arr));
		}
		System.out.println("After Right Rotating "+n+" times --> "+Arrays.toString(arr));
		sc.close();
	}
}

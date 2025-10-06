package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateAnArrayMethod2 {

	public static int[] RightRotateMethod2(int arr[],int k) {
		int rotate[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			rotate[(i+k)%arr.length] = arr[i];
		}
		return rotate;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println("Before Right Rotation --> "+Arrays.toString(arr));
		System.out.println("Enter the number of Right rotations :");
		int k=sc.nextInt();
		System.out.println("After Right Rotation --> "+Arrays.toString(RightRotateMethod2(arr,k)));
		sc.close();
	}
}

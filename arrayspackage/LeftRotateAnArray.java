package arrayspackage;

import java.util.Arrays;

public class LeftRotateAnArray {

	public static int[] leftRotate(int arr[]) {
		
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1]=temp;
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,4,5,6};
		System.out.println("Before Left Rotation --> "+Arrays.toString(arr));
		leftRotate(arr);
		System.out.println("After Left Rotation --> "+Arrays.toString(arr));
	}
}

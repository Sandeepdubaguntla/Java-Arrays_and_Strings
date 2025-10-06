package arrayspackage;

import java.util.Arrays;

public class RightRotateAnArray {

	public static int[] leftRotate(int arr[]) {
		
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=temp;
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,4,5,6};
		System.out.println("Before Right Rotation --> "+Arrays.toString(arr));
		leftRotate(arr);
		System.out.println("After Right Rotation --> "+Arrays.toString(arr));
	}
}

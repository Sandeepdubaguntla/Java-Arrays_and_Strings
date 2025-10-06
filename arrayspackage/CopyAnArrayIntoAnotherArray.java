package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class CopyAnArrayIntoAnotherArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array..");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in the arr Array:");
//		for(int i=0;i<size;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println(Arrays.toString(arr));
		
		int temp[]=new int[size];
		System.out.println("Elements in the Temp Array:");
		for(int i=0;i<size;i++) {
			temp[i]=arr[i];
//			System.out.println(temp[i]);
		}
		System.out.println(Arrays.toString(temp));
		sc.close();
	}
}

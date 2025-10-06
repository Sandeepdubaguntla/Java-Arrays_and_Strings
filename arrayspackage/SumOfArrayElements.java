package arrayspackage;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array..");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of the Array Elements is : "+sum);
		sc.close();
	}
}

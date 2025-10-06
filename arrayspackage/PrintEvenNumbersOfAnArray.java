package arrayspackage;

import java.util.Scanner;

public class PrintEvenNumbersOfAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter "+size+" Elements :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Even Elements of the Array are : ");
		for(int i=0;i<size;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}

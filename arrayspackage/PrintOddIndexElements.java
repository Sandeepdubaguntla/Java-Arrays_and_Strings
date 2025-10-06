package arrayspackage;

import java.util.Scanner;

public class PrintOddIndexElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array..");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements which are present at odd indexes are: ");
		for(int i=0;i<size;i++) {
			//i represents the index of the array
			if(i % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}

package arrayspackage;

import java.util.Scanner;

public class FindElementFromAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to find: ");
		int ele=sc.nextInt();
		//int count=0;
		String res="Not Found";
		
		for(int i=0;i<size;i++) {
			if(ele==arr[i]) {
				//count++;
				res="Found";
				break;
			}
		}
//		if(count>0) {
//			System.out.println("Element found...");
//		}else {
//			System.out.println("Element not found...");
//		}
		System.out.println(ele+" "+res);
		sc.close();
	}
}

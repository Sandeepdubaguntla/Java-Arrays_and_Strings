package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnArrayIsSortedOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int size=sc.nextInt();
		System.out.println("Enter the Elements into the Array :");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		boolean cond=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				cond =  false;
				break;
			}
		}
		if(cond)
			System.out.println("The given Array is Sorted");
		else
			System.out.println("The given Array is Not Sorted");
		sc.close();
	}
}

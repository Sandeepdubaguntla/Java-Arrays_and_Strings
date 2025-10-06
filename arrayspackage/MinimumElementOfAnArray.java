package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementOfAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you need to enter");
		int n=sc.nextInt();
		System.out.println("Enter elements: ");
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int mini=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<mini)
			{
				mini=arr[i];
			}
		}
		System.out.println("Minimum Element of an Array is : "+mini);
		sc.close();
	}
}

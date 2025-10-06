package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class SortingOfAnArrayInDescendingOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int a=sc.nextInt();
		System.out.println("Enter the Elements into Array: ");
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sorted Array :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	
}


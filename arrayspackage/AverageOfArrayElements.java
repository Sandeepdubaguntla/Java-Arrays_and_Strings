package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;
public class AverageOfArrayElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you need to enter");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int total=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			total=total+arr[i];
		}
		int average=total/n;
		
		System.out.println("The above array is "+average);
		sc.close();
	}
}

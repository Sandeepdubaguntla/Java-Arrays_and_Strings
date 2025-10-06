package arrayspackage;

import java.util.Scanner;

public class PrintEvenElementFromOddIndexes {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size the Array :");
		int a=sc.nextInt();
		System.out.println("Enter the Array Elements");
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i % 2 != 0 && arr[i] % 2 == 0)
			{
				System.out.print(arr[i]+" ");
		    }
	}
		sc.close();
}
}

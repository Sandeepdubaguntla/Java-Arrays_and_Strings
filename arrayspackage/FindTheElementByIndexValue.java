package arrayspackage; 

import java.util.Scanner;

public class FindTheElementByIndexValue {
public static void main(String[] args) throws InterruptedException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size the Array :");
	int a=sc.nextInt();
	System.out.println("Enter the Array Elements");
	int arr[]=new int[a];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	Thread.sleep(2000);
	System.out.println("enter the index to get number");
	int match=sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(i==match)
		{
			System.out.println("found the value is "+arr[i]);
			break;
		}	
	}
	sc.close();
}
}

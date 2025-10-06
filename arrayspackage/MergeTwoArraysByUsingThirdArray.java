package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArraysByUsingThirdArray {
  
  public static void merge(int a[],int b[]) {
    int c[] = new int[a.length + b.length];
    
    for(int i=0;i<a.length;i++) {
      c[i]=a[i];
    }
    int index=a.length;
    for(int i=0;i<b.length;i++) {
      c[index++]=b[i];
    }
    System.out.println(Arrays.toString(c));
  }
  
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size the First Array :");
		int size=sc.nextInt();
		System.out.println("Enter the First Array Elements");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Size the Second Array :");
		int size1=sc.nextInt();
		System.out.println("Enter the Second Array Elements");
		int b[]=new int[size1];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
    merge(a,b);
    sc.close();
  }
}

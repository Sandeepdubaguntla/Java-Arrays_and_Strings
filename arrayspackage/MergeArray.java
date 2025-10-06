package arrayspackage;

import java.util.Arrays;

public class MergeArray {
	
	public static void mergeMethod1(int []a,int []b)
	{
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int index=a.length;
		for(int i=0;i<b.length;i++)
		{
			c[index]=b[i];
			index++;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();

	}
	public static void mergeMethod2(int []a,int []b) {
		int size = a.length+b.length;
		int c[] = new int[size];
		for(int i=0;i<a.length;i++) {
			c[i] = a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}
	public static void mergeMethod3(int []a,int []b) {
		int size = a.length+b.length;
		int c[] = new int[size];
		for(int i=0;i<c.length;i++) {
			if(i<a.length)
				c[i] = a[i];
			else {
				c[i] = b[i-a.length];
			}
		}
		
		System.out.println(Arrays.toString(c));
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8,9};
		mergeMethod1(a,b);
		mergeMethod2(a, b);
		mergeMethod3(a, b);
		
	}
}

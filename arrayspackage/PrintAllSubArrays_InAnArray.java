package arrayspackage;

import java.util.Scanner;


public class PrintAllSubArrays_InAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of An Array :");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the Elements into Array :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}
}

/*
 * a[]= {1,2,3,4,5};
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

2 
2 3 
2 3 4 
2 3 4 5 

3 
3 4 
3 4 5 

4 
4 5 

5 
*/

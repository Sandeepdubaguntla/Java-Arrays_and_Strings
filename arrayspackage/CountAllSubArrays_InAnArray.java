package arrayspackage;

import java.util.Scanner;

public class CountAllSubArrays_InAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of An Array :");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the Elements into Array :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
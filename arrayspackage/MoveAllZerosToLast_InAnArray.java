package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZerosToLast_InAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of An Array :");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the Elements into Array :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int index=0;
		for(int i=0;i<size;i++) {
			if(a[i]!=0) {
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
				index++;
			}
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}
}

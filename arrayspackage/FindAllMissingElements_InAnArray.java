package arrayspackage;

import java.util.Scanner;

public class FindAllMissingElements_InAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of An Array :");
		int size=sc.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the Elements into Array :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		boolean missingEle[] = new boolean[max + 1];
		for (int i = 0; i < a.length; i++) {
				missingEle[a[i]]=true;
		}
		for (int i = 0; i < missingEle.length; i++) {
			if(!missingEle[i]) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}

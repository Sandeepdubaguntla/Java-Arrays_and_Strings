package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

// here we are ignoring the element and printing the remaining.

public class DeleteAnElementFromAnArray{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array :");
    int size=sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the Elements into array :");
    for(int i=0;i<size;i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("Enter the element to delete :");
    int del=sc.nextInt();
    for(int i=0;i<size;i++) {
      if(arr[i] != del) {
        System.out.print(arr[i]+" ");
      }
    }
    sc.close();
    
  }
}

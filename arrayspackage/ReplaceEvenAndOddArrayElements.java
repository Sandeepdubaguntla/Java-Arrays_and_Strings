package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceEvenAndOddArrayElements {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array :");
    int size=sc.nextInt();
    System.out.println("Enter the elements :");
    int arr[]=new int[size];
    for(int i=0;i<size;i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<size;i++) {
      if(arr[i] % 2 == 0) {
        arr[i]=0;
      }else {
        arr[i]=1;
      }
      System.out.print(arr[i]+ " ");
    }
    sc.close();
  }
}

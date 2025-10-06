package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class Find2ndMaximumElementOfArrayWithSorting {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array :");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter Elements into Array :");
    for(int i=0;i<size;i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
//    System.out.println("Sorted Array :");
    for(int i=0;i<size;i++) {
      for(int j=i+1;j<size;j++) {
        if(arr[i]<arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
//    System.out.println(Arrays.toString(arr));
    System.out.println("Second Maximum Element of an Array is : "+arr[1]);
    sc.close();
    
  }
}

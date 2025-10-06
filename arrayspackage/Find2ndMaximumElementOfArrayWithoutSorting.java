package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class Find2ndMaximumElementOfArrayWithoutSorting {
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
    int firstMax=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
    for(int i=0;i<size;i++) {
      if(arr[i] > firstMax) {
        secondMax = firstMax;
        firstMax = arr[i];
      }else if(arr[i] > secondMax &&  arr[i] !=firstMax) {
        secondMax = arr[i];
      }
    }
    System.out.println("Second Maximum Element of an Array is : "+secondMax);
    sc.close();
    
  }
}

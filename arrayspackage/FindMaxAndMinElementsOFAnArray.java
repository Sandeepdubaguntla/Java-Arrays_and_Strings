package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxAndMinElementsOFAnArray {
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
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<size;i++) {
      if(arr[i] >= max) {
        max=arr[i];
      }
      if(arr[i]<min) {
        min=arr[i];
      }
    }
    System.out.println("Maximum element in an array is : "+max);
    System.out.println("Minimum element in an array is : "+min);
    sc.close();
  }
}

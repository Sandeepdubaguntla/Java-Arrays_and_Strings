package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayWithoutUsingTempArray {
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
    int start=0,end=arr.length-1;
//    for(int start=0,end=arr.length-1;start<end;start++,end--)
    while(start<end) {
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
    System.out.println(Arrays.toString(arr));
    
    
    sc.close();
  }
}

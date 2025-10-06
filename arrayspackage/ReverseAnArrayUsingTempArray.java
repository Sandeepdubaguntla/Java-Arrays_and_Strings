package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayUsingTempArray {
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
    int index=0;
    int temp[]=new int[size];
    for(int i=size-1;i>=0;i--) {
      temp[index++]=arr[i];
    }
    System.out.println(Arrays.toString(temp));
    
    
    sc.close();
  }
}

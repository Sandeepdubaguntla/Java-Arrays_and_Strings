package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class PrintElementsBasedOnIndexValue {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array :");
    int size=sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the Elements into array :");
    for(int i=0;i<size;i++) {
      arr[i]=sc.nextInt();
    }
//    int arr[] = {4,2,8,0,1,9};

    System.out.println(Arrays.toString(arr));
    System.out.println("Enter the Index value :");
    int index=sc.nextInt();
    if(index >=0 && index<=arr.length) {
      System.out.println(arr[index]+" is present in "+index+" Index.");
    }
    else {
      System.out.println("Index out of bounds");
    }
    sc.close();
  }
}

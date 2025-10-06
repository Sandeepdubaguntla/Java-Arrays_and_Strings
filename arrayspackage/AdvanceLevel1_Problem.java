package arrayspackage;

import java.util.Arrays;
import java.util.Scanner;

public class AdvanceLevel1_Problem {
	
	public static int[] SplitSortRotateAndMerge(int[] arr) {
		int length=arr.length;
		int first;
		if(length % 2 == 0) 
			first = length/2;
		else 
			first = length/2 + 1;
		int second= length - first;
		int subArray1[] = new int[first];
		int subArray2[] = new int[second];
		int index=0;
		for(int i=0;i<subArray1.length;i++){
			subArray1[i]=arr[index++];
		}
		for(int i=0;i<subArray2.length;i++){
			subArray2[i]=arr[index++];
		}
		System.out.println("First Half Array -->"+ Arrays.toString(subArray1));
		System.out.println("Second Half Array -->"+ Arrays.toString(subArray2));
		
		int [] sortedSubArray1 = sortDescending(subArray1);
		System.out.println("Sorted First half Array(Descending ordered Array)"+Arrays.toString(sortedSubArray1));
		int [] sortedSubArray2 = sortAscending(subArray2);
		System.out.println("Sorted Second half Array(Ascending ordered Array)"+Arrays.toString(sortedSubArray2));
		
		int [] sortedRotatedSubArray1 = RightRotate(sortedSubArray1);
		System.out.println("Right Rotated First half Array(Descending ordered Array)"+Arrays.toString(sortedSubArray1));
		int [] sortedRotatedSubArray2 = leftRotate(sortedSubArray2);
		System.out.println("Left Rotated Second half Array(Ascending ordered Array)"+Arrays.toString(sortedSubArray2));
		
		int mergeArray[] = merge(sortedRotatedSubArray1,sortedRotatedSubArray2);
		
		
		return mergeArray;
	}
	public static int[] sortAscending(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	return arr;
	}
	public static int[] sortDescending(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	public static int[] leftRotate(int arr[]) {
		int temp = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1]=temp;
		return arr;
	}
	public static int[] RightRotate(int arr[]) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=temp;
		return arr;
	}
	public static int[] merge(int arr1[],int arr2[]) {
		int length=arr1.length + arr2.length;
		int res[] = new int[length];
		int index1=0,index2=0;
		for(int i=0;i<res.length;i++) {
			if(i<arr1.length)
				res[i] = arr1[index1++];
			else
				res[i]=arr2[index2++];
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int a=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int res[] = SplitSortRotateAndMerge(arr);
		System.out.println(Arrays.toString(res));
		sc.close();
	}
}

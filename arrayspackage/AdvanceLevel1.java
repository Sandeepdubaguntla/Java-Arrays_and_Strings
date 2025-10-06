package arrayspackage;

import java.util.Arrays;

public class AdvanceLevel1 {
	
	public static int[] splitSortAndMerge(int arr []) {
		int length =arr.length;
		int first=0;
		if(length % 2 ==0) {
			first = length/2;
		}else {
			first=length/2 + 1;
		}
		int second = length - first;
		// Split
		int [] subArray1 = new int[first];
		int [] subArray2 = new int[second];
		int index=0;
		for(int i=0;i<subArray1.length;i++) {
			subArray1[i] = arr[index++];
		}
		for(int i=0;i<subArray2.length;i++) {
			subArray2[i] = arr[index++];
		}
		System.out.println("First Half Array -->"+ Arrays.toString(subArray1));
		System.out.println("Second Half Array -->"+ Arrays.toString(subArray2));
		
		int [] sortedSubArray1 = sortAscendingOrder(subArray1);
		System.out.println("Sorted First half Array(Ascending ordered Array)"+Arrays.toString(sortedSubArray1));
		int [] sortedSubArray2 = sortDescendingOrder(subArray2);
		System.out.println("Sorted Second half Array(Descending ordered Array)"+Arrays.toString(sortedSubArray2));

		int [] mergeArray = merge(sortedSubArray1,sortedSubArray2);
		
		return mergeArray;
	}
	
	
	public static int[] sortAscendingOrder(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] sortDescendingOrder(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] merge(int [] arr1,int [] arr2) {
		int length = arr1.length + arr2.length;
		int res [] = new int[length];
		int index1=0;
		int index2=0;
		for(int i=0;i<res.length;i++) {
			if(i<arr1.length) {
				res[i]=arr1[index1++];
			}
			else {
				res[i]=arr2[index2++];
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,7,9,3,5,1,6,4,8};
		int result [] = splitSortAndMerge(arr);
		System.out.println(Arrays.toString(result));
	}
}

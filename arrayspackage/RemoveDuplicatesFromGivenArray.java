package arrayspackage;

import java.util.Arrays;

public class RemoveDuplicatesFromGivenArray {
	public static void main(String[] args) {
		int arr[] = {5,3,5,1,3,2,5,3,4,7,2,6};
		System.out.println(Arrays.toString(arr));
		boolean visited[] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) 
		{
			if(!visited[i]) 
			{
			int count=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
				}
			}
			if(count >= 1) {
				System.out.print(arr[i]+" ");
			}
			}
		}
		
	}
}

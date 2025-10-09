package arrayspackage;

import java.util.ArrayList;

public class ConvertAnArray_Into_ArrayList {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		ArrayList<Integer> alist = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			alist.add(arr[i]);
		}
		System.out.println(alist);
	}
}

package arrayspackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertAnArrayList_Into_Array {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		alist.add(60);
		
		int arr[] = new int[alist.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = alist.get(i);
		}
		System.out.println(Arrays.toString(arr));
	}
}

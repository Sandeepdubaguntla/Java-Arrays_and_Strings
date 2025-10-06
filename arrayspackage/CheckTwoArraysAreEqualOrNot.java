package arrayspackage;

public class CheckTwoArraysAreEqualOrNot {
	
	public static void checkEqual(int a[],int b[]) {
		String result="Both Arrays are Equal";
		if(a.length != b.length) {		
			result="Both Arrays are not Equal";
		}
		else {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					 result="Both Arrays are not Equal";
					 break;
				}
			}			
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {5,4,3,2,1};
		checkEqual(a, b);
	}
}

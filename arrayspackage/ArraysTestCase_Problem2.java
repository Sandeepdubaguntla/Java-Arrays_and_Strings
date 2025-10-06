package arrayspackage;

public class ArraysTestCase_Problem2 {
  
  public static boolean isZero(int a[]) {
    for(int i=0;i<a.length;i++) {
      if(a[i] == 0)
        return true;
    }
    return false;
  }
  
  public static void smallest(int a[]) {
    int smallest=a[0]; 
    for(int i=0;i<a.length;i++) {
      if(a[i]<smallest) {
        smallest=a[i];
      }
    }
    System.out.println("Smallest Number is :"+smallest);
  }
  
  public static void main(String[] args) {
    int a[]= {7,1,15,13,8};
    if(isZero(a)) {
      System.out.println("Arrays contains Negative elements...");
    }else {
      smallest(a);
    }
  }
}

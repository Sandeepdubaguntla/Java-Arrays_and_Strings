package arrayspackage;

public class ArraysTestCase_Problem1 {
  
  public static boolean isNegative(int a[]) {
    for(int i=0;i<a.length;i++) {
      if(a[i] < 0)
        return true;
    }
    return false;
  }
  
  public static int largest(int a[]) {
    int largest=a[0]; 
    for(int i=0;i<a.length;i++) {
      if(a[i]>largest) {
        largest=a[i];
      }
    }
    System.out.println("Largest Number is :"+largest);
      return largest;
  }
  
  public static void factors(int a[]) {
    int large=largest(a);
    for(int i=1;i<=large;i++) {
      if(large % i == 0)
      System.out.println(i);
    }
  }
  public static void main(String[] args) {
    int a[]= {7,1,15,13,8};
    if(isNegative(a)) {
      System.out.println("Arrays contains Negative elements...");
    }else {
      factors(a);
    }
  }
}

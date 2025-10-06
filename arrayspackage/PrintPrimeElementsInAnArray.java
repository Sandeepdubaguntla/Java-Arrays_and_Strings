package arrayspackage;

import java.util.Scanner;

public class PrintPrimeElementsInAnArray {
  
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false; // 0 and 1 are not prime
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to print all prime elements in the array
    public static void primeElements(int arr[]) {
        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        primeElements(arr);
        sc.close();
    }
}

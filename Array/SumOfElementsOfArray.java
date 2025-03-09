// package Array;

import java.util.Scanner;

public class SumOfElementsOfArray {
    
    static int sumOfElements(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // countFreq(arr);
        System.out.println(sumOfElements(arr));
        sc.close();
    }
}

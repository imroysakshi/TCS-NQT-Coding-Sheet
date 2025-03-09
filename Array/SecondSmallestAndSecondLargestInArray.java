// package Array;
import java.util.Scanner;

public class SecondSmallestAndSecondLargestInArray {

    static void findsecSmallestAndLargest(int arr[]){
          int smallest=Integer.MAX_VALUE;
          int secSmallest=Integer.MAX_VALUE;
          int largest=Integer.MIN_VALUE;
          int secLargest=Integer.MIN_VALUE;
          for(int i=0;i<arr.length;i++){
              if(arr[i]<smallest){
                secSmallest=smallest;
                smallest=arr[i];
              }
                 
              if(arr[i]>smallest && arr[i]<secSmallest)
                 secSmallest=arr[i];
              if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
              }
              if(arr[i]<largest && arr[i]>secLargest)
                secLargest=arr[i];
          }
          System.out.println(secSmallest);
          System.out.println(secLargest);
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the values in array: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    findsecSmallestAndLargest(arr);
    sc.close();
 }
}

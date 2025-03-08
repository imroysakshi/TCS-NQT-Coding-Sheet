package Array;
import java.util.Scanner;

public class SmallestElementInArray {

    static int findSmallest(int arr[]){
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest)
               smallest=arr[i];
        }
        return smallest;
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
    System.out.println("The smallest value in an array is: "+findSmallest(arr));

    sc.close();
   }

}

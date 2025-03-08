package Array;
import java.util.Scanner;

public class ArrayReverse {
   

    static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
          int temp = arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
          i++;
          j--;
        }
        
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
    System.out.println("The reversed array is: ");
    reverse(arr);
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
    }
    sc.close();
   }
}

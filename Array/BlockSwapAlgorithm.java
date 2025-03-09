import java.util.Scanner;

public class BlockSwapAlgorithm {

    static void reverseArray(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void rotateElementsByk(int arr[],int k){
        int n=arr.length;
        k=(n-k)%n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr, k, n-1);
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
    System.out.println("Enter the value of k: ");
    int k=sc.nextInt();
    rotateElementsByk(arr,k);
    for(int i=0;i<arr.length;i++)
       System.out.print(arr[i]+" ");
    sc.close();
  }
}

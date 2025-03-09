import java.util.Scanner;

public class FindMedianOfGivenArr {

    static void merge(int arr[],int si,int mid,int ei){
        int ans[]=new int[(ei-si+1)];
        int k=0;
        int i=si;
        int j=mid+1;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }
            else{
                ans[k++]=arr[j++];
            }
            
        }
        while(i<=mid){
            ans[k++]=arr[i++];
        }
        while(j<=ei){
            ans[k++]=arr[j++];
        }
    }

    static void mergeSort(int arr[],int si,int ei){
        if(si>=ei)
           return;
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    static double findMedian(int arr[]){
        mergeSort(arr,0,arr.length-1);
        int n=arr.length;
        double median;
        if(n%2==0){
            median=arr[n/2]+arr[(n/2)-1];
            median = median/2;
        }
        else
           median=arr[n/2];
        return median;
    }
    public static void main(String args[]){
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the size of array: ");
    // int n=sc.nextInt();
     int arr1[]={1,2,3,4,5,6};
     int arr2[]={1,2,3,4,5};
    // System.out.println("Enter the values in array: ");
    // for(int i=0;i<n;i++){
    //     arr[i]=sc.nextInt();
    // }
    // System.out.print("The median is: ");
     System.out.println(findMedian(arr1));
     System.out.print(findMedian(arr2));
    // sc.close();

    
  }
}

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfElementInArray {

    static void countFreq(int arr[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            // if(hm.get(arr[i]),hm.getOrDefault(arr[i], 0)+1);
           hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        for(Integer k:hm.keySet()){
            System.out.println(k+" "+hm.get(k));
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
    countFreq(arr);
    sc.close();
  }
}

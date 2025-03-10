import java.util.ArrayList;

public class removeDuplicatesFromUnsortedArray {

    static ArrayList<Integer> removeDuplicatesFromUnsortedArray(int arr[]){
         ArrayList<Integer> ans=new ArrayList<>();
         for(int i=0;i<arr.length;i++){
            if(!ans.contains(arr[i])){
                ans.add(arr[i]);
             }
         }
         return ans;
    }
    public static void main(String args[]){
        int arr[]={1,1,5,3,3,4,2,5,5,7};
        System.out.println(removeDuplicatesFromUnsortedArray(arr));
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }
    }
}

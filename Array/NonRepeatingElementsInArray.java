import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;

public class NonRepeatingElementsInArray {

    static ArrayList<Integer> nonRepeating(int arr[]){
     ArrayList<Integer> ans=new ArrayList<>();
     for(int i=0;i<arr.length;i++){
        if(!ans.contains(arr[i]))
        ans.add(arr[i]);
     }
     return ans;
    }
    public static void main(String args[]){
        int arr[]={1,1,2,3,3,4,5,5,5,7};
        System.out.println(nonRepeating(arr));

        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }
    }
}

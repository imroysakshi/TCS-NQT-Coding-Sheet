// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class RepeatingElementsInArray {
    static void repeatingElements(int arr[]){
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ans.put(arr[i], ans.getOrDefault(arr[i], 0)+1);
        }
        for(Entry<Integer,Integer> key: ans.entrySet()) {
	        if(key.getValue()>1)
	            System.out.print(key.getKey()+" ");
	    }    
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,5,5,5,8,8,7,7,7,7};
        repeatingElements(arr);
    }
    
}

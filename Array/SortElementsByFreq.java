import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
    Pair(){

    }
}

public class SortElementsByFreq {
    
    public static void sortFreq(int []arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i<arr.length ;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

       ArrayList<Pair> vec=new ArrayList<>();
       for(int x:hm.keySet()){
          vec.add(new Pair(x,hm.get(x)));
       }
       Collections.sort(vec,(a,b)->{
            if(a.second==b.second)
                return a.first-b.first;
            else
                return b.second-a.second;
       });
       for(int i=0;i<vec.size();i++){
        while(vec.get(i).second>0){
            System.out.print(vec.get(i).first+" ");
            vec.get(i).second--;
        }
       }
    }
       public static void main(String[] args) {
        int arr[] = {3, 3, 5, 2,2, 1, 1, 2};
        // int n = 7;
        sortFreq(arr);
       }
    
}

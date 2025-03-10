import java.util.HashMap;

public class SymmetricPairsInArray {
    public static void main(String args[]){
        int arr[][]={{1,2},{3,4},{2,1},{4,5},{5,4}};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int second=arr[i][1];
            if(hm.get(second)!=null && hm.get(second)==first)
               System.out.print("("+first+","+second+")"+" ");
            hm.put(first,second);
        }
    }
}

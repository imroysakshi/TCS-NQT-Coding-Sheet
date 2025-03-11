import java.util.Arrays;
import java.util.HashMap;

public class ReplaceElementByRank {
    public static void main(String args[]){
        int arr[]={20,15,26,2,98,6};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int temp=1;
        int n=arr.length;
        int arrTemp[]=new int[n];
        for(int i=0;i<arr.length;i++)
           arrTemp[i]=arr[i];
        Arrays.sort(arrTemp);
        for(int i=0;i<n;i++){
            if(hm.get(arrTemp[i])==null){
                hm.put(arrTemp[i], temp);
                temp++;
            }
                
        }
        for(int j=0;j<n;j++){
            System.out.print(hm.get(arr[j])+" ");
        }
    }
}

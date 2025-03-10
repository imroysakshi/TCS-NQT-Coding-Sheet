public class RemoveDuplicatesInPlace {

    static void removeDuplicates(int arr[]){
        int i=0;
        int j;
        for(j=1;j<arr.length;j++){
            // if(arr[i]==arr[j]){
            //     j++;
            // }
            // else{
            //     arr[i+1]=arr[j];
            //     j++;
            // }

            if(arr[i]!=arr[j])
               i++;
            arr[i]=arr[j];
        }
    }
    public static void main(String args[]){
        int arr[]={1,1,2,3,3,4,5,5,5,7};
        removeDuplicates(arr);
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }
    }
}

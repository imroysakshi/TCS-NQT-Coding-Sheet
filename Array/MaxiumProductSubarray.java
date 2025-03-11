public class MaxiumProductSubarray {

    static int maxProductSubarray(int arr[]){
        int maxProduct=arr[0];
        int minProduct=arr[0];
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }


            maxProduct = Math.max(arr[i], arr[i] * maxProduct);
            minProduct = Math.min(arr[i], arr[i] * minProduct);

            result=Math.max(maxProduct,result);
            // if(arr[i]==0)
            // {
            //     maxProduct=1;
            //     minProduct=1;
            //     if(result<0)
            //        result=0;
            // }
            
            // System.out.print(result+" ");
        }
        // System.out.println();  
        return result;
    }
    public static void main(String args[]){
        int arr[]={-2,3,-4,0,7,8};
        int arr2[]={1, 4, 0, -4, 3};
        int arr3[]={-2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, -1, 4};
        int arr4[]={-2,0,-3};
        System.out.println(maxProductSubarray(arr2));
        System.out.println(maxProductSubarray(arr));
        System.out.println(maxProductSubarray(arr3));
        System.out.println(maxProductSubarray(arr4));
        // for(int i=0;i<arr.length;i++){
        //      System.out.print(arr[i]+" ");
        // }
    }
}

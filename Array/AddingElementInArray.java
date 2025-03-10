import java.util.*;


public class AddingElementInArray {

 
    static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }
    }

     //at beginning 
    static void addAtBeginning(int arr[],int value){
        int n=arr.length-1;
        for(int i=n-1;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=value;
        // printArr(arr);
        
    }

     //at specified index
    static void addAtIndex(int arr[],int value,int index){
        for (int i = arr.length-1; i >= index; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[index - 1] = value;
        // printArr(arr);
        
    }

    //end
    static void insertatEnd(int[] arr, int value)
    { 
        int n=arr.length-1;
         arr[n] = value;
         printArr(arr);
    }



    //add at beginning using arraylist
    static ArrayList<Integer> insertAtBeginning(int arr[],int value){
         ArrayList<Integer> ans=new ArrayList<>();
         ans.add(value);
         for(int i=0;i<arr.length;i++)
           ans.add(arr[i]);
          return ans;
    }

    //add at specific position using arraylist
    static ArrayList<Integer> insertAtPosition(int arr[],int position,int value){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<position;i++){
            ans.add(arr[i]);
        }
        ans.add(value);
        for(int j=position;j<arr.length;j++){
            ans.add(arr[j]);
        }
        return ans;
    }

    //add at the end using arraylist
    static ArrayList<Integer> insertAtEnd(int arr[],int value){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        ans.add(value);
        return ans;
    }


    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int value=3;
        // addAtBeginning(arr, value);
        // addAtIndex(arr, value, 2);
        // insertatEnd(arr, value);
        //    printArr(arr);

        System.out.println(insertAtBeginning(arr,value));
        System.out.println(insertAtPosition(arr, 4, value));
        System.out.println(insertAtEnd(arr,value));

    }
}

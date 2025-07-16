package DSA.Basic.Recursion;

public class ReverseAnArray {

    public static void main(String[] args){
        int [] arr={10,20,30,40,50};
        reverseAnArraysUsingPointer(arr,0);
        for(int n:arr){
            System.out.print(" "+n);
        }
    }


    public static void reverseAnArraysUsingPointer(int [] arr,int idx){
        int mirrors = arr.length - 1-idx;
        if(idx>=mirrors){
            return;
        }
        int temp=arr[mirrors];
        arr[mirrors]=arr[idx];
        arr[idx]=temp;
        reverseAnArraysUsingPointer(arr,idx+1);
    }
}

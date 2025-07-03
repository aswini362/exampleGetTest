package Recursion;

public class ReverseAnArrays {

    public static void main(String[]args){
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array: ");
        for (int i : arr) System.out.print(i + " ");

        reverseAnArray(arr, 0, arr.length - 1);

        System.out.println("\nReversed Array: ");
        for (int i : arr) System.out.print(i + " ");
    }

    public static void reverseAnArray(int arr[],int left,int right){
        if(left>=right){
            return ;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseAnArray(arr,left+1, right-1);
    }
}


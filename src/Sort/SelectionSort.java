package Sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        for (int num : arr) {
            System.out.print(" " + num);
        }

       /* int [] arr1={10,5,15,23};

        Arrays.stream(arr1).filter(x->String.valueOf(x).startsWith("1")).forEach(System.out::println);*/


    }

    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
         for(int j=i+1;j<n;j++){
             if(arr[j]<arr[minIndex]){
                 minIndex=arr[j];
             }
         }
         int temp=arr[i];
         arr[i]=arr[minIndex];
         arr[minIndex]=temp;
        }
    }
}

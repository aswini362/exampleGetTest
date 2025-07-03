package Arrays;


import java.util.*;

public class ArrayPermutations {

    public static void main(String [] args){
        int[] arr={1,2,3};
      genartedAllPermutations(arr);
    }

    public static void genartedAllPermutations(int [] arr){
        permuate(arr,0);
    }

    public static void  permuate(int [] arr,int index){

        if(arr.length==index){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i=index;i<arr.length;i++){
            swap(arr,i,index);
            permuate(arr,index+1);
            swap(arr,i,index);
        }

    }

    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

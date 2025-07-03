package collections;

import java.util.Arrays;

public class RotationArrays {
    public static void main(String[]args){
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums1, 3);
        System.out.println("Output 1: " + Arrays.toString(nums1));


    }

    public static void rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        reverseAnArrays(arr,0,n-1);
        reverseAnArrays(arr,0,k-1);
        reverseAnArrays(arr,k,n-1);

    }
    public static void reverseAnArrays(int [] num,int start,int end){
        while (start<end){
            int temp=num[start];
            num[start++]=num[end];
            num[end--]=temp;
        }
    }
}

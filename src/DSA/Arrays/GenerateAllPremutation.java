package DSA.Arrays;

import java.util.Arrays;

public class GenerateAllPremutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums, 0, nums.length - 1);
    }

    public static void permute(int [] nums,int left,int right){
       if(left==right){
           System.out.println(Arrays.toString(nums));
           return;
       }
       for(int i=left;i<=right;i++){
           swap(nums,left,i);
           permute(nums,left+1,right);
           swap(nums,left,i);

       }
    }
    public static void swap(int []nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;

    }


}

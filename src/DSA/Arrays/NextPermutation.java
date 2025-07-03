package DSA.Arrays;

import static DSA.Arrays.Sort0S1s2s.swap;

public class NextPermutation {
    public static void main(String [] args){
     int nums[]={1,2,3};
     permutation(nums);
     for(int num:nums){
         System.out.print(" "+num);
     }
    }

    public static void permutation(int[] nums){
        int i=nums.length-2;
        while (i>=0 && nums[i]>nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while (nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}

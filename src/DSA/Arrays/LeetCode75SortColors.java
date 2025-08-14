package DSA.Arrays;

import java.util.Arrays;

import static DSA.Arrays.GenerateAllPremutation.swap;

public class LeetCode75SortColors {

    public static void main(String[] args) {
        int [] nums={2, 0, 2, 1, 1, 0};
        //countingSortColors(nums);
        sortColorsOptimal(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void countingSortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int i = 0;

        while (count0-- > 0) {
            nums[i++] = 0;
        }
        while (count1-- > 0) {
            nums[i++] = 1;
        }
        while (count2-- > 0) {
            nums[i++] = 2;
        }
    }

    public static void sortColorsOptimal(int [] nums){
        int low=0,mid=0,high=nums.length-1;
        while (mid<=high){
            if(nums[mid]==0){
                swap(nums,low++,mid++);
            } else if (nums[mid]==1) {
                mid++;
            }else{
                swap(nums,mid,high--);
            }

        }

    }

}

package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String [] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSums(nums, target);
        System.out.println(Arrays.toString(result));
    }


    public static int[] twoSums(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

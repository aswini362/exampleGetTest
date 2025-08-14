package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = permute(nums);
        System.out.println(permute);
    }

    public static List<List<Integer>> permute(int[] nums){
          List<List<Integer>> results=new ArrayList<>();
          backtrack(nums,0,results);
          return results;
    }
    public static void backtrack(int [] nums,int start,List<List<Integer>> results){
        if(start==nums.length){
            List<Integer> permutation=new ArrayList<>();
            for(int num:nums){
                permutation.add(num);
            }
            results.add(permutation);
            return;
        }
        for(int i=start;i<nums.length;i++){
            swap(nums,start,i);
            backtrack(nums,start+1,results);
            swap(nums,start,i);

        }
    }
    public static void swap(int []nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;

    }
}

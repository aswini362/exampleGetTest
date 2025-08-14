package DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class LeetCode128LongestConsecutiveSequence {

    public static void main(String[] args) {
        int [] nums={101,100,1,102,2,3,4};
        System.out.print(longestSubSequenceCountOptimal(nums));

    }

    public static int longestSubSequenceCountBrute(int[] nums) {
        int n = nums.length;
        int longest = 0;
        for (int i = 1; i <n; i++) {
            int currentNum = nums[i];
            int count = 1;

            while (contains(nums,currentNum+1)){
                currentNum++;
                count++;
            }
            longest=Math.max(longest,count);
        }
        return longest;

    }

    public static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static int longestSubSequenceCountOptimal(int [] nums) {
        int n = nums.length;
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}

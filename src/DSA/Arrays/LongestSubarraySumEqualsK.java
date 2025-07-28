package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 1, 9};
        int k = 10;
        System.out.println(perfixSumCount(nums, k));
    }

    public static int countSubArraysSum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }

        }

        return count;
    }
   // its works both positive and negative case
    public static int perfixSumCount(int[] arr, int k) {
        int n = arr.length; // size of the array.
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += arr[i];
            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }


    // only works on positive case
    public static int usingTwoPointer(int [] arr,int k) {
        int maxLength = 0;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            // Shrink window until sum <= k
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        return maxLength;
    }
}

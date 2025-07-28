package DSA.Arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSumInSubArrays(nums));
    }

    public static int maxSubaarysSums(int[] nums) {
        int maxSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }

        }


        return maxSum;

    }

    public static int maxSumInSubArrays(int [] nums){
     int currentSum=nums[0];
     int maxSum=nums[0];
     for(int i=0;i<nums.length;i++){
         currentSum=Math.max(nums[i],currentSum+nums[i] );
         maxSum=Math.max(maxSum,currentSum);

     }
     return maxSum;
    }

}

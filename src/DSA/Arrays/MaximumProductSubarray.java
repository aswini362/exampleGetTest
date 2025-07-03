package DSA.Arrays;

public class MaximumProductSubarray {

    public static void main(String [] args){
      int [] nums={2,3,-2,4};
      System.out.println(maxProductSubArrays(nums));
    }

    public static int maxProductSubArrays(int [] nums){
        int n=nums.length;
        int maxProduct=nums[0];
        int currentMax=nums[0];
        int currentMin=nums[0];

        for(int i=1;i<n;i++){
            int temp=currentMax;
            currentMax=Math.max(nums[i],Math.max(currentMax*nums[i],currentMin*nums[i]));
            currentMin=Math.min(nums[i],Math.min(temp*nums[i],currentMin*nums[i]));
            maxProduct=Math.max(maxProduct,currentMax);

        }

        return maxProduct;
    }
}

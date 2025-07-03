package Arrays;

public class FindMinimuminRotatedSortedArray {
    public static int findMin(int [] nums){
        int end=nums.length-1;
        int start=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[end]){
                end=mid;
            }else {
                start=mid+1;
            }

        }

        return nums[start];
    }
}

package DSA.Arrays;

public class CheckIfArraySortedOrNot {
    public static void main(String[] args) {

    }


    public static boolean check(int[] nums){
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
}

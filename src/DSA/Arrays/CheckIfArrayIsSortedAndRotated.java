package DSA.Arrays;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {

    }

    public static boolean isArraySorted(int [] nums){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }

       return count<=1;
    }
}

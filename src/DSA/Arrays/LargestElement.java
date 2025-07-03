package DSA.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LargestElement {

    public static void main(String [] args){
        int[] nums = {10, 5, 20, 8, 3};
        int largest = findLargest(nums);
        System.out.println("Largest Element: " + largest);
        int i = Arrays.stream(nums).max().orElseThrow();
        System.out.println(i);
    }

    public static int findLargest(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}

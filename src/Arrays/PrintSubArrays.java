package Arrays;

import java.util.Arrays;

public class PrintSubArrays {

    public static void main(String [] args){
        int[] nums={1,2,3};
        printAllSubarrays(nums);
        System.out.print(Arrays.toString(nums));
    }

    public static void printAllSubarrays(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k]);
                    if (k < j) System.out.print(", ");
                }
                System.out.println("]");
            }
        }
    }
}

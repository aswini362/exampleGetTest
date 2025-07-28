package DSA.Arrays;

public class PrintSubArrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int n = nums.length;

        for (int i = 0; i < n; i++) {            // Start index of subarray
            for (int j = i; j < n; j++) {        // End index of subarray
                for (int k = i; k <= j; k++) {   // Print each element in subarray
                    System.out.print(nums[k] + " ");
                }
                System.out.println();            // Newline after each subarray
            }
        }
    }

}

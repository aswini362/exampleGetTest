package DSA.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotationLeft(nums, k);
        for (int num : nums) {
            System.out.print(" " + num);

        }
    }

    public static void rotationLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);  //reverse whole arrays
        reverse(nums, 0, k - 1);  // reverse k element
        reverse(nums, k, n - 1);  //  // Reverse last n-k elements

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }

    }
}

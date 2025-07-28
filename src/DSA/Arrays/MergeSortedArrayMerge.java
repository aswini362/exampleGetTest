package DSA.Arrays;

import java.util.Arrays;

public class MergeSortedArrayMerge {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] ints = mergeSortAnArrays(nums1, nums2);
        System.out.println(Arrays.toString(ints));
    }


    public static int[] mergeSortAnArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            merged[m + j] = nums2[j];
        }
        Arrays.sort(merged);
        return merged;
    }
}

package DSA.Sort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        int n = arr.length;
        int maxVal = 0;
        //find max value in array
        for (int i = 1; i < n; i++) {
            maxVal = Math.max(maxVal, arr[i]);
        }
        // count
        int[] count = new int[maxVal + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i <= maxVal; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

    }
}

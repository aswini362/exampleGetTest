package Arrays;

import java.util.Arrays;

public class Sort0s1s2s {

    public static void main(String[] args){
        int[] arr={2,0,1};
        sortNumbers(arr);
        System.out.print(Arrays.toString(arr));
    }


    public static void sortNumbers(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swapSort(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swapSort(arr, mid, high);
                high--;
            }
        }
    }

    private static void swapSort(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

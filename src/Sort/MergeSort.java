package Sort;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length - 1;
        sort(arr, 0, n);
        for (int num : arr) {
            System.out.print(" " + num);
        }
    }


    public static void sort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        sort(arr, low, mid);  // left half
        sort(arr, mid + 1, high); // right half
        mergeSort(arr, low, mid, high);  // merging sorted halves
    }

    public static void mergeSort(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}



package DSA.Sort;

/*
🔢 Selection Sort
💡 Idea:

Selection Sort repeatedly selects the smallest (or largest) element from the unsorted portion of the array and moves it to the sorted portion.
        ✅ Algorithm Steps:

For an array of size n:

Start from index i = 0 to n-1.

Find the index of the minimum element in the range [i, n-1].

Swap the element at index i with the minimum element found.

Repeat until the array is sorted.
*/

public class SelectionSort {
    public static void main(String... args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        for (int n : arr) {
            System.out.print(" " + n);
        }
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
}

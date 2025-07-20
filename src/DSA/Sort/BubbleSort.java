package DSA.Sort;

/*🔁 Bubble Sort
💡 Idea:

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. After each full pass, the largest unsorted element "bubbles up" to its correct position.
        ✅ Algorithm Steps:

For an array of size n:

Loop from i = 0 to n - 1.

Inside the loop, compare each pair arr[j] and arr[j + 1].

If arr[j] > arr[j + 1], swap them.

After each outer loop iteration, the largest element gets placed at the end of the unsorted section.*/
public class BubbleSort {

    public static void main(String...args){
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSorting(arr);
        for (int n : arr) {
            System.out.print(" " + n);
        }
    }


    public static void bubbleSorting(int arr[]){
        int n = arr.length;
        boolean swapped=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
}

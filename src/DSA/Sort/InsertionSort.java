package DSA.Sort;

/*
✏️ Insertion Sort
💡 Idea:

Imagine sorting playing cards in your hand:

Start with the second card.

Compare it with the ones before it.

Insert it into the correct position.
Repeat for all cards.

That’s Insertion Sort!
        ✅ Algorithm Steps:

For an array arr of size n:

Start from index 1 to n - 1 (i.e., i = 1 to n - 1).

Store arr[i] in a temporary variable key.

Compare key with previous elements arr[j] (where j = i - 1) and shift them one position to the right if they're greater than key.

Insert key into its correct position.
*/


public class InsertionSort {

    public static void main(String[] args){
        int[] arr = {5, 2, 4, 6, 1, 3};
        insertionSort(arr);
        for(int n:arr){
            System.out.print(" "+n);

        }
    }


    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}

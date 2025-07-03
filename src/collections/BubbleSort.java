package collections;

public class BubbleSort {
    //write a sort logic useing bubble sort

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(data);
        System.out.println("Sorted array: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] inputElement) {
        int n = inputElement.length;
        boolean swapped ;
        for (int i = 0; i < n - 1; i++) {
            swapped=false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (inputElement[j] > inputElement[j + 1]) {
                    int temp = inputElement[j];
                    inputElement[j] = inputElement[j + 1];
                    inputElement[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}

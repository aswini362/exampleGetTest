package collections;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {4, 1, 6, 3, 8, 9, 10};
        selectionSort(data);
        System.out.println("Sorted array: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
}

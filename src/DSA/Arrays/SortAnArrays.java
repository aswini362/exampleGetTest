package DSA.Arrays;

public class SortAnArrays {

    public static void main(String[] args) {
        int [] arr={2,45,3,2,3,5,7,4};
        quickSort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(" "+num);
        }
    }


    public static void quickSort(int [] arr,int low,int high){

        if(low<high){
            int partionIndex = partionIndex(arr, low, high);
            quickSort(arr,low,partionIndex-1);
            quickSort(arr,partionIndex+1,high);

        }

    }

    private static int partionIndex(int[] arr, int low, int high) {
        int pivotIndex=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivotIndex){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

}

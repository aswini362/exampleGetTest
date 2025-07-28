package DSA.Arrays;

public class LargestElementAnArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        selectionSort(arr);
        for(int num:arr){
            System.out.println(" "+num);
            break;
        }
        System.out.println(findMaxNumberAnArrays(arr));
    }



    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    //using recursive apporach

    public static int findMaxNumberAnArrays(int [] arr){
        int max=arr[0];
        for(int num:arr){
            if(num >max){
                max=num;
            }
        }
        return max;
    }
}

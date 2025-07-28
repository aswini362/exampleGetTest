package DSA.Arrays;

public class SecondLargestElementAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        usingInsertionSort(arr);
        int secondLargestElement = arr[1];
        System.out.println(" "+secondLargestElement);
        System.out.println(findSecondMaxOfElementAnArrays(arr));
    }
    // brute force approached
    public static void usingInsertionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]<key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }

    public static int findSecondMaxOfElementAnArrays(int [] arr){
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>firstMax){
                secondMax=firstMax;
                firstMax=num;
            } else if (num> secondMax && num!=firstMax) {
                secondMax=num;
            }

        }
        return (secondMax!=Integer.MIN_VALUE)? secondMax:-1;
    }



}

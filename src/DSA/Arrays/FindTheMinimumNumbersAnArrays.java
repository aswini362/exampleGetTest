package DSA.Arrays;

public class FindTheMinimumNumbersAnArrays {

    public static void main(String[] args){
        int[] arr={3,4,5,1,2};
     findMinimum(arr);
    }
    public static int findMinimum(int [] arr){
        int end=arr.length-1;
        int start=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[end]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}

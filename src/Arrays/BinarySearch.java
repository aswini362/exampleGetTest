package Arrays;

public class BinarySearch {

    public static void main(String[] args){
        int[] nums = {1, 3, 5, 7, 9, 11};
        System.out.println(searchIndex(nums,7));
    }

    public static int searchIndex(int[] arr,int k){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int index = start + (end - start) / 2;
            if(arr[index]==k){
                return index;
            } else if (arr[index]<k) {
                start=index+1;
            }else {
                end=index-1;
            }
        }
       return -1;
    }
}

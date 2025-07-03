package collections;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindLargestElementOfAnArrays {

    public static void main(String [] args){
        int [] arr ={1,5,3,7,4,2,53,12,98};
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println(maximum);
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }

    public static int printLaragestElementAnArrays(int[] arr){
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}

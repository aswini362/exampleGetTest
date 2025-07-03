package collections;

import java.util.Arrays;

public class findMinAndMaxMumNumberOfArrays {

    public static void main(String [] args) {
        int[] arr = {1, 423, 6, 46, 34, 23, 13, 53, 4};


        int max=0;int min=0;
        for(int num:arr){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }

    }
}

package collections;

import java.util.Arrays;

public class CheckArraysIsSortedOrNot {

    public static void main(String[] args){
        int [] arr={1,3,4,6,8};
        boolean b = checkedArraySortedOrNot(arr);
        System.out.println(b);
    }
    public static boolean checkedArraySortedOrNot(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        boolean equals = Arrays.equals(arr, sorted);
        return equals;
    }
}

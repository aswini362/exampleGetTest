package DSA.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String [] arg){
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] result = mergeAndSort(arr1, arr2);
        System.out.println("Merged & Sorted Array: " + Arrays.toString(result));
    }

    public static int[] mergeAndSort(int[] arr1,int[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        int [] mergerd=new int[m+n];

        for(int i=0;i<m;i++){
            mergerd[i]=arr1[i];
        }
        for(int i=0;i<n;i++){
            mergerd[m+i]=arr2[i];
        }
        Arrays.sort(mergerd);
        return mergerd;
    }
}

package DSA.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSortInPlaceNative {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(8, 4, 2, 9, 1, 5, 3, 7, 6));
        quickSort(list,0, list.size()-1);
        System.out.println(list);
    }
    public static void quickSort(List<Integer> list,int low,int high){
        if(low<high){
          int pivotIndex  = partitionIndex(list,low,high);
          quickSort(list,low,pivotIndex-1);
          quickSort(list,pivotIndex+1,high);
        }
    }

    private static int partitionIndex(List<Integer> list, int low, int high) {
        Integer pivotIndex = list.get(high);
        int i=low-1;
        for(int j=low;j<high;j++){
            if(list.get(j)<pivotIndex){
                i++;
                Collections.swap(list,i,j);
            }
        }
        Collections.swap(list,i+1,high);
        return i+1;
    }
}

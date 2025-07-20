package DSA.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(8, 4, 2, 9, 1, 5, 3, 7, 6);
        List<Integer> sorted = quickSort(input);
        System.out.println("Sorted List: " + sorted);
    }

    public static List<Integer> quickSort(List<Integer> list){
        if(list.size()<=1){
            return list;
        }
        int pivot=list.get(list.size()/2);
        List<Integer> quickSortList=new ArrayList<>();
        List<Integer> less=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        List<Integer> greater=new ArrayList<>();
        for(int num:list){
            //if pivot< num reverse order sorting
            if(num<pivot){
                less.add(num);
            } else if (num==pivot) {
                equal.add(num);
            }else{
                greater.add(num);
            }
        }
        quickSortList.addAll(quickSort(less));
        quickSortList.addAll(equal);
        quickSortList.addAll(quickSort(greater));
        return quickSortList;
    }
}

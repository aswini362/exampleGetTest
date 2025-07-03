package DSA.Arrays;

import java.util.*;

public class ArraysDuplicates {

    public static void main(String[] args){
        int [] arr={1, 8, 4, 3, 6, 9, 5, 7, 2, 7, 0};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int [] arr){
        Set<Integer> set=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();
        for(int num:arr){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }
        List<Integer> list=new ArrayList<>(duplicates);
        if(list.size()==0){
            list.add(-1); // Add -1 to indicate no duplicates
            return list;
        }else{
            Collections.sort(list);
        }
        return list;
    }
}

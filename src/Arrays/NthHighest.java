package Arrays;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class NthHighest {

    public static void main(String [] args){
        int[] arr = {10, 20, 30, 20, 10};
        int k = 2;
        System.out.println(findNthHighestNumberAnArrays(arr,k));
    }

    public static int findNthHighestNumberAnArrays(int [] arr,int k){
        Set<Integer> set=new TreeSet<>(Collections.reverseOrder());
        for(int num:arr){
            set.add(num);
        }
        int count=1;
        for(int num:set){
            if(count==k){
                return num;
            }
            count ++;
        }
        return -1;
    }
}

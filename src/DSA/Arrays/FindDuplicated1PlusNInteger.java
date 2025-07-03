package DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicated1PlusNInteger {

    public static void main(String [] args){

    }

    public static int findDuplicate(int [] nums){
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return num;
            }else{
                set.add(num);
            }
        }
        return -1;
    }
}

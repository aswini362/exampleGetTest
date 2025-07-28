package DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 3};
        System.out.println(isSetContainsDuplicate(nums));
    }


    public static boolean isSetContainsDuplicate(int [] nums){
        Set<Integer> seen=new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)){
                return true;
            }
          seen.add(num);
        }
       return false;
    }
}

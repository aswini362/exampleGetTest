package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInAnArray {
    public static void main(String[]args){
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] arr){
        Set<Integer>  set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longest=0;
          for(int num:set){
              if(!set.contains(num-1)){
               int currentNum=0;
               int count=0;
                  while (set.contains(currentNum + 1)) {
                      currentNum++;
                      count++;
                  }
                  longest = Math.max(longest, count);
              }
          }


        return longest;
    }
}

package DSA.Arrays;

import java.util.*;

public class ThreeSums {

    public static void main(String [] args){

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
              int target=-nums[i]-nums[j];
              if(set.contains(target)){
                  List<Integer> triplet = Arrays.asList(nums[i], nums[j], target);
                  Collections.sort(triplet);
                  result.add(triplet);
              }else{
                  set.add(nums[j]);
              }
            }
        }

        return new ArrayList<>(result) ;
    }
}

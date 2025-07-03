package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static void main(String[] args){

    }

    public static int subArrays(int[] nums,int k){
        int count=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    // sort zeros and 1 s
    public static int[] sortArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] == 1 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            } else if (array[i] == 0) {
                i++; // 0 is in correct place
            } else {
                j--; // 1 is in correct place or we're waiting to find a 0 on the right
            }
        }

        return array;
    }

}

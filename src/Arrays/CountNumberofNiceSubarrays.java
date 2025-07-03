package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofNiceSubarrays {


    public static int numberOfSubarrays(int[] nums, int k) {
      int oddCount=0;
      int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for(int num:nums){
            if(num%2!=0){
                oddCount++;
            }
            result+=map.getOrDefault(oddCount-k,0);
            map.put(oddCount,map.getOrDefault(oddCount,0)+1);
        }

      return result;
    }
}

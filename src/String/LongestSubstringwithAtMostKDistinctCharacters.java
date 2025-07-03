package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostKDistinctCharacters {

    public static void main(String [] args){
        System.out.println(LongestSubstringwithAtMostKDistinctChar("eceba",2));
    }

    public static int LongestSubstringwithAtMostKDistinctChar(String s,int k){

        Map<Character,Integer> map=new HashMap<>();
        int left=0;int maxLength=0;

        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.size()>k){
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }


      return maxLength;
    }


}

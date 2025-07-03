package String;

import java.util.HashMap;
import java.util.Map;

public class NumberofSubstringsContainingAllThreeCharacters {

   public static void main(String[] args){
       System.out.println(numberOfSubstrings("aaacb"));
   }
    public int numberOfSubstrings1(String s) {
        int[] freq = new int[3];
        int count = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += s.length() - right;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }

    public static int numberOfSubstrings(String s){
        int count=0;
        int left=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int righth=0;righth<s.length();righth++){
            char c = s.charAt(righth);
            map.put(c,map.getOrDefault(c,0)+1);
            while (map.size()==3){
                count+=s.length()-righth;
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar)==0){
                map.remove(leftChar);
                }
                left++;
            }
        }

        return count;
    }
}

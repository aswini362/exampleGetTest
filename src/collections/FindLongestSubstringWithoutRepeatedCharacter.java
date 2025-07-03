package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubstringWithoutRepeatedCharacter {

    public static void main(String[]args){
       // printLongestSubStringLengthAndCharacter("pwwkew");
        printLongestSubStringLengthAndCharacter("abcabcbb");
    }

    public static void printLongestSubStringLengthAndCharacter(String input) {
        int maxLength = 0;
        String longestSubstring = "";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (map.containsKey(ch)) {
                // Reset the loop starting from the next character after the duplicate
                i = map.get(ch);
                map.clear();
            } else {
                map.put(ch, i);

                if (map.size() > maxLength) {
                    maxLength = map.size();
                    longestSubstring = map.keySet().toString();
                }
            }
        }

        System.out.println("Length of the longest substring: " + maxLength);
        System.out.println("Characters: " + longestSubstring);
    }

}

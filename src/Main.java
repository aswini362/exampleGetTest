import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(characterReplacement("AABABBA", 1));

        List<Integer> list=List.of(1,2,5,6,7,8,9);
        list.stream().forEach(num->System.out.print(" " + num));
    }

    public static int characterReplacement(String s, int k) {
        int maxLength = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        int right;
        int left = 0;
        int maxCount = 0;
        for (right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c , 0)+ 1);
            maxCount = Math.max(maxCount, map.get(c));
            while ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
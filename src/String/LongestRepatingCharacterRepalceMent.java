package String;

public class LongestRepatingCharacterRepalceMent {

    public static void main(String[] args) {
        System.out.print(characterReplaceMent("ABAB", 2));
    }

    public static int characterReplaceMent(String s, int k) {
        int result = 0;
        int maxCount = 0;
        int[] count = new int[26];
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            result = Math.max(maxCount, right - left + 1);
        }

        return result;
    }
}

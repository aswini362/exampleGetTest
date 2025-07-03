package String;

public class PrintSubStringTotalAndCount {
    public static void main(String[] args) {
        String s = "aabcb";
        totalBeatuySum(s);
    }

    public static int totalBeatuySum(String s) {

        int totalBeatuy = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                int maxValue = 0;
                int minValue = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        maxValue = Math.max(maxValue, f);
                        minValue = Math.min(minValue, f);
                    }
                }
                int beauty = maxValue - minValue;
                totalBeatuy += beauty;

                String substring = s.substring(i, j + 1);
                System.out.println("Substring: \"" + substring + "\" → Beauty: " + beauty);
            }

        }
        System.out.print(totalBeatuy);
        return totalBeatuy;
    }
}

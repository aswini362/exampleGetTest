package String;

public class ReplaceWithOccurrenceTwoPointers {
    public static void main(String[] args) {
        String input = "ababccd";
        char target = 'b';

        StringBuilder result = new StringBuilder();
        int i = 0;
        int count = 0; // acts as the count of the target character

        while (i < input.length()) {
            char ch = input.charAt(i);
            if (ch == target) {
                count++;
                result.append(count);
            } else {
                result.append(ch);
            }
            i++;
        }

        System.out.println("Output: " + result); // Output: a1a2ccd
    }
}

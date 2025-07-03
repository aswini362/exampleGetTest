package String;

public class LargestOddNumberGiveString {

    public static void main(String [] args){
        System.out.print(largestOddNumber("35427"));
    }

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}

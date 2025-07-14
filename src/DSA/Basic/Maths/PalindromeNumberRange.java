package DSA.Basic.Maths;

public class PalindromeNumberRange {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        for (int i = start; i <= end; i++) {
            if (isPalindromeNumber(i)) {
                System.out.print(" " + i);
            }
        }

    }


    public static boolean isPalindromeNumber(int n) {
        int originalNumber = n;
        int rev = 0;

        while (n > 0) {
            int lastDigits = n % 10;
            rev = (rev * 10) + lastDigits;
            n = n / 10;
        }
        return originalNumber == rev;
    }
}

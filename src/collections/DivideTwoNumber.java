package collections;

public class DivideTwoNumber {

    public static void main(String[]args){
        System.out.println(divide(10, 3));
    }

    public static int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        while (a >= b) {
            long temp = b;
            long multiple = 1;

            // Double the divisor until it's the largest value <= a
            while (a >= (temp << 1)) {
                temp <<= 1;         // temp = temp * 2
                multiple <<= 1;     // multiple = multiple * 2
            }

            a -= temp;              // Subtract that chunk from dividend
            result += multiple;     // Add the multiple to result
        }

        return isNegative ? -result : result;
    }
}

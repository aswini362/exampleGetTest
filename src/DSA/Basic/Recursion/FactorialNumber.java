package DSA.Basic.Recursion;

public class FactorialNumber {

    public static void main(String... args) {
        System.out.println(factorialNumber(5));
    }

    public static int factorialNumber(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialNumber(n - 1);
    }
}

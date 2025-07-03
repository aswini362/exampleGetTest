package Recursion;

public class fibonacciSeries {
    public static void main(String [] args){
        System.out.println(fibonacciNumber(10));
        int n = 20; // You can change this value

        System.out.print("Fibonacci numbers from 1 to " + n + ": ");
        int i = 1;
        int fib;

        while (true) {
            fib = fibonacciNumber(i);
            if (fib > n) break;
            System.out.print(fib + " ");
            i++;
        }
    }

    public static int fibonacciNumber(int n){
        if(n==0 ){
            return 0;
        }if(n==1){
            return 1;
        }
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }
}

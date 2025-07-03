package Recursion;

public class FactrioalNumber {
    public static void main(String [] args){
        System.out.print(findFactorialNumberOFN(5));
    }
    public static int findFactorialNumberOFN(int n){
        if(n==0 || n==1) {
            return n;
        }
        return n*(findFactorialNumberOFN(n-1));
    }
}

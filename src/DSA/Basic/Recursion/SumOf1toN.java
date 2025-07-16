package DSA.Basic.Recursion;

public class SumOf1toN {
    public static void main(String...args){

        System.out.println(printNumber(10));
    }


    public static int printNumber(int n){
        if(n==0){
            return n;
        }
        return printNumber(n-1)+n;
    }
}

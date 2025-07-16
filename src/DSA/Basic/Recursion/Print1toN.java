package DSA.Basic.Recursion;

public class Print1toN {
    public static void main(String...args){
        printNumber(10);
    }


    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
}

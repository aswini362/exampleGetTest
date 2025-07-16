package DSA.Basic.Recursion;

public class Print1toNReverseOrder {
    public static void main(String...args){
        printNumber(10);
    }


    public static void printNumber(int n){
        if(n==0){
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }
}

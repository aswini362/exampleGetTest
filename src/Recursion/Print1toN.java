package Recursion;

public class Print1toN {

    public static void main(String[]args){
        print1ToNNumber(10);
    }

    public static void print1ToNNumber(int n){
        if(n==0){
            return;
        }
        print1ToNNumber(n-1);
        System.out.print(" "+n);
    }
}

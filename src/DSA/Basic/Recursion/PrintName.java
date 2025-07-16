package DSA.Basic.Recursion;

public class PrintName {
    public static void main(String...args){
        printNames(5,"Aswini");
    }


    public static void printNames(int n, String names){
        if(n==0){
            return;
        }
        System.out.println(names);
        printNames(n-1,names);

    }
}

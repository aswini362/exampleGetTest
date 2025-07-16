package DSA.Basic.Maths;

public class UglyNumbers {

    public static void main(String...args){
        System.out.println(isNumberUgly(14));
    }

    public static boolean isNumberUgly(int n){
        if(n==0){
            return true;
        }
        while (n%2==0)
            n=n/2;
        while (n%3==0)
            n=n/3;
        while (n%5==0)
            n=n/5;
        return n==1;
    }
}

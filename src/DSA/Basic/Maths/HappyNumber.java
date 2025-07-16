package DSA.Basic.Maths;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String...args){

       System.out.println(isHappy(19));
        System.out.println(isHappy(7));
        System.out.println(isHappy(2));


    }

    public static boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getNumberOfSquares(n);
        }
        return n==1;
    }


    public static int getNumberOfSquares(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
}

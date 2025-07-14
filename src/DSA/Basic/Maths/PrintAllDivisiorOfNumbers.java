package DSA.Basic.Maths;

import java.util.Set;
import java.util.TreeSet;

public class PrintAllDivisiorOfNumbers {

    public static void main(String[] args){
        int n=36;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(" "+i);
            }
        }
        System.out.println("          ");
        //optimal approach
        Set<Integer> divisiors=new TreeSet<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                divisiors.add(i);
                divisiors.add(n/i);
            }
        }
        System.out.println("Divisors of " + n + ": " + divisiors);
    }
}

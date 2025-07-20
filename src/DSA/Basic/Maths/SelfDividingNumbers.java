package DSA.Basic.Maths;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static void main(String...args) {
        int left = 1, right = 22;
        List<Integer> results = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)){
                results.add(i);
            }
        }
         System.out.println(results);
    }

    public static boolean isSelfDividingNumber(int num){
        int original=num;

        while (num>0){
            int digit=num%10;
            if(digit==0 || original%digit!=0){
                return false;
            }
            num=num/10;
        }
        return true;
    }



}

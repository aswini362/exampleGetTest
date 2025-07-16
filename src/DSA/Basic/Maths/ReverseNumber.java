package DSA.Basic.Maths;


/*
| Step | `num` | `lastDigits` | `rev`           |
        | ---- | ----- | ------------ | --------------- |
        | 1    | 123   | 3            | 0×10 + 3 = 3    |
        | 2    | 12    | 2            | 3×10 + 2 = 32   |
        | 3    | 1     | 1            | 32×10 + 1 = 321 |
*/


public class ReverseNumber {

    public static void main(String[] args){
     System.out.println(rev(-123));
     System.out.println(rev(123));

    }

    public static int rev(int x){
        long rev=0;
        int sign=x<0 ?-1:1;
        x=Math.abs(x);
        while (x>0){
            int lastDigits=x%10;
            rev=rev*10+lastDigits;
            x=x/10;
        }
        rev*=sign;
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            return 0;
        }
        return (int)rev;
    }

}



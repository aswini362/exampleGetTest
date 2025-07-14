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

        int rev=0;
        int num=123;
        //out put 321
        while (num>0){
            int lastDigits = num % 10;
            rev=(rev*10)+lastDigits;
            num=num/10;
        }
        System.out.println(rev);
    }

}



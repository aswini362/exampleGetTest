package Math;

public class SumOfDigits {

    public static void main(String [] args){
        int n=123;
        int sum=0;
        while (n>0){
            int digit=n%10;
            n=n/10;
            sum=sum+digit;
        }
        System.out.println(sum);
    }
}

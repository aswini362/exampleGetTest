package Recursion;

public class Print1toNSumOfValues {

    public static void main(String[]args){

        System.out.println(sumOfNNumber(10));
        System.out.println(recursionSumNNumber(10));
    }

    public static int  sumOfNNumber(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static int  recursionSumNNumber(int n){
        if(n==0){
            return 0;
        }
        return n+(recursionSumNNumber(n-1));
    }
}

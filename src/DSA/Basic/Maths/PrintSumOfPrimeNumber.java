package DSA.Basic.Maths;

public class PrintSumOfPrimeNumber {


    public static void main(String... args){
        int n=10;
        int sum=0;
        for(int i=1;i<n;i++){
            if(checkNumberIsPrime(i)){
                sum=sum+i;
            }
        }
        System.out.println(sum);

    }


    public static boolean checkNumberIsPrime(int n){
        if(n==1){
            return false;

        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

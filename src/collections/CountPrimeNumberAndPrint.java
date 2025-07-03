package collections;

import java.util.Arrays;

public class CountPrimeNumberAndPrint {

    public static void main(String[] args){
      countPrintPrimeNumber(30);
        countPrintPrimeNumber(10);
        countPrintPrimeNumber(0);
        countPrintPrimeNumber(1);
    }

    public static void countPrintPrimeNumber(int n){
        if(n<2){

            return;
        }
        boolean[] isPrime=new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                System.out.print(" "+i);
                count++;
            }
        }
        System.out.println("\nTotal number of primes less than " + n + ": " + count);
    }
}

package DSA.Basic.Maths;

public class PrintPrimeNumber1toN {
    public static void main(String[] args){

        int n=25;

        for(int i=1;i<n;i++){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(" " +i);
            }
        }
    }
}

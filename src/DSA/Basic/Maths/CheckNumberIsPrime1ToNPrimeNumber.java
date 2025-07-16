package DSA.Basic.Maths;

public class CheckNumberIsPrime1ToNPrimeNumber {

   public static void main(String[] args){
       for(int i=2;i<=100;i++){
           if(checkPrimeNumber(i)){
               System.out.print(" "+i);
           }
       }
   }

    public static boolean checkPrimeNumber(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

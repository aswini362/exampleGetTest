package DSA.Basic.Maths;

public class CheckNumberIsPrimeOrNot {

   public static void main(String[] args){
       System.out.println(checkPrimeNumber(4));
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

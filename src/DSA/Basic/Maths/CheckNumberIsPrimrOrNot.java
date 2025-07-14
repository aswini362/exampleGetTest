package DSA.Basic.Maths;

public class CheckNumberIsPrimrOrNot {

    public static void main(String[] args){
        int n=5;
        boolean isPrime=true;
        if(n==1){
            System.out.println("Not prime");
            return;
        }
        //Math.sqrt() forumla
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }if(isPrime){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }
}

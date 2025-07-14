package DSA.Basic.Maths;

public class checkTheNumberEvenOrOdd {
    public static void main(String[] args){
        System.out.println(checkEvenOrOdd(3));
    }

    public static boolean checkEvenOrOdd(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
}

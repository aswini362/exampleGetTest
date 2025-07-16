package DSA.Basic.Maths;

public class PerfectNumber {

    public static void main(String...args){
        System.out.println(isNumberIsPerfect(28));
    }
    public static boolean isNumberIsPerfect(int n){
        if(n<=1){
            return false;
        }
        int sum=1;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                sum=sum+i;
                int pair=n/i;
                if (pair != i) sum += pair;
            }
        }
        return sum==n;
    }
}

package DSA.Basic.Maths;

public class Print1ToNNumbersInReverseOrder {

    public static void main(String...arg){
        int n=10;
        for(int i=n;i>=1;i--){
            System.out.print(" "+i);
        }
        System.out.println(" ");
        int i=n;
        while (i>=1){
            System.out.print(" "+i);
            i--;
        }
        System.out.println(" ");
    }
}

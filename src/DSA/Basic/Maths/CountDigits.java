package DSA.Basic.Maths;

public class CountDigits {

    public static void main(String [] args){

        int n=236372;
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);

        //better approach
        int num=124;
        int count1 = (num == 0) ? 1 : (int)Math.log10(num) + 1;
        System.out.println(count1);
    }
}

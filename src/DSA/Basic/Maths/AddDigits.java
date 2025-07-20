package DSA.Basic.Maths;

public class AddDigits {

    public static void main(String...args){
        System.out.println(addDigitsSum(38));
    }

    public static int addDigitsSum(int num){
        while(num>=10){
            int sum=0;
            while (num>0) {
                int lastDigits = num % 10;
                sum = sum + lastDigits;
                num = num / 10;
            }
            num=sum;
        }

         return num;
    }
}

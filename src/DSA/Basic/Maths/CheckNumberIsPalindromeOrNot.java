package DSA.Basic.Maths;

public class CheckNumberIsPalindromeOrNot {

    public static void main(String[] args){
        int rev=0;
        int num=121;
        int orginalNumber=num;
        while (num>0){
            int lastDigits = num % 10;
            rev=(rev*10)+lastDigits;
            num=num/10;
        }
        if(orginalNumber==rev){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is Not Palindrome");
        }
    }
}

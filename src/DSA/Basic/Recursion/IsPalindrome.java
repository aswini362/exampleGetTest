package DSA.Basic.Recursion;

public class IsPalindrome {

     public static void main(String[] args){
         String str = "racecar";


         if (checkStringIsPalindrome(str, 0, str.length() - 1)) {
             System.out.println(str + " is a Palindrome");
         } else {
             System.out.println(str + " is NOT a Palindrome");
         }
     }

    public static Boolean checkStringIsPalindrome(String str,int left,int right){
        if(left>=right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return checkStringIsPalindrome(str,left+1,right-1);
    }
}

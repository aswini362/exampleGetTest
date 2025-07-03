package collections;

public class StringIsPalindromeOrNot {


    public static void main(String [] args){
        boolean palindrome = isPalindrome("Racecar");
        System.out.print(palindrome);
    }

    public static boolean isPalindrome(String input){
        input = input.replaceAll("\\s+", "").toLowerCase();
        int left=0;
        int right=input.length()-1;
        while (left<right){
            if(input.charAt(left)!= input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

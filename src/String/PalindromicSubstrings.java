package String;

public class PalindromicSubstrings {

    public static void main(String [] args){
        System.out.println(palindromePossiableString("aaa"));
    }
    public static int palindromePossiableString(String s){
        int count=0;
        for(int center=0;center<2*s.length()-1;center++){
            int left=center/2;
            int right=left+(center%2);
            while(left>=0&right<s.length() && s.charAt(left)==s.charAt(right)){
                System.out.println(s.substring(left,right+1));
                left--;
                right++;
                count++;
            }
        }
        return count;
    }
}

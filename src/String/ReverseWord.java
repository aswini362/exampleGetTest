package String;

public class ReverseWord {

    public static void main(String[] args){
        System.out.print(reverseString("a good   example"));
    }
    public static String reverseString(String str){
        String[] words = str.trim().split("\\s");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString();
    }
}

package String;

public class CountAndSay {

   public static void main(String[]args){
       System.out.print(countAndSayGivenNumber(4));
   }
    public static String countAndSayGivenNumber(int n){
        if(n==1){
            return "1";
        }
        String prevLength = countAndSayGivenNumber(n - 1);
        StringBuilder sb = new StringBuilder();
        int cnt=1;
        for(int i=1;i<prevLength.length();i++){
            if(prevLength.charAt(i)==prevLength.charAt(i-1)){
                cnt++;
            }else{
                sb.append(cnt).append(prevLength.charAt(i-1));
                cnt=1;
            }
        }
        sb.append(cnt).append(prevLength.charAt(prevLength.length() - 1));
        return sb.toString();
    }
}

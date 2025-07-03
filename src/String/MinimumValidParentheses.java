package String;

public class MinimumValidParentheses {

    public static void main(String [] args){
        System.out.print(validParenthess("())"));
    }

    public static int validParenthess(String str){
        int open=0;
        int additions=0;
        for(char ch:str.toCharArray()){
            if(ch=='('){
                open++;
            }else{
                if(open>0){
                    open--;
                }else{
                    additions++;
                }
            }
        }
        return open+additions;
    }
}

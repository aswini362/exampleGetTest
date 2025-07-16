package DSA.Basic.Maths;

public class GCD {

    public static void main(String...args){
        Integer results = gcdOfTwoNumber(20, 30);
        System.out.println(results);
    }

    public static Integer gcdOfTwoNumber(int a,int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}

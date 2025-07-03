package DSA.BitManipulations;

public class AddBinary {

    public static void main(String[] args){
        String a = "1010", b = "1011";
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while (i>=0 || j>=0 || carry==1){
            int sum=carry;

            if(i>=0)
                sum+=a.charAt(i--)-'0';
            if(j>=0)
                sum+=b.charAt(j--)-'0';

            result.append(sum%2);

            carry=sum/2;
        }
        result.reverse().toString();
        System.out.println(result);
    }
}

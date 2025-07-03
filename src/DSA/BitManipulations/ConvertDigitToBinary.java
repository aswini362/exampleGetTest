package DSA.BitManipulations;

public class ConvertDigitToBinary {

    public static void main(String [] args){
        int n=12;
        StringBuilder sb=new StringBuilder();
        while(n>0) {
            int convert = n & 1;
            sb.append(convert);
            n=n >>1;
        }
        sb.reverse().toString();
        System.out.println(sb);
    }
}

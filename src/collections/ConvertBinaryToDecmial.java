package collections;

public class ConvertBinaryToDecmial {

    public static void main(String[] args) {
       System.out.println(binaryToDecimal(10));
       System.out.println(decmialToBinary("1010"));
    }

    private static String binaryToDecimal(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int reminder = n % 2;
            sb.append(reminder);
            n = n / 2;
        }

        return sb.reverse().toString();
    }

    private static int decmialToBinary(String str){
        int decimal=0;
        int power=0;
        for(int i=str.length()-1;i>=0;i--){
            char bit = str.charAt(i);
            if(bit=='1'){
                decimal+=Math.pow(2,power);
            }
            power++;
        }
        return decimal;
    }
}

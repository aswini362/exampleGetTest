package collections;

public class TestString {

    public static void main (String[] args){
        String s="Aswini";
        String mohanty = s.concat("Mohanty");


        StringBuffer stringBuffer = new StringBuffer("Aswini");
        stringBuffer.append(" Mohanty");
        System.out.println(s);
        System.out.println(mohanty);
        System.out.println(stringBuffer);
    }
}

package collections;



public class ReverseString {

    public static void main(String[] args){
        String reverse="Hello";
        StringBuilder stringBuilder=new StringBuilder("Hello");
        StringBuilder reverse1 = stringBuilder.reverse();
        System.out.print(reverse1);
        //using another apporach
        System.out.println("--------------------");
        char[] charArray = reverse.toCharArray();
        for(int i=charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]);
        }
        System.out.println("---------------------");
        for(int i=reverse.length()-1;i>=0;i--){
            System.out.print(reverse.charAt(i));
        }
        //java 8
    }
}

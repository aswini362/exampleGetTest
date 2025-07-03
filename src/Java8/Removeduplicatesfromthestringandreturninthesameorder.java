package Java8;


public class Removeduplicatesfromthestringandreturninthesameorder {
    public static void main(String[] args){
        String str="dabcadefg";
         str.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::print);

    }

}

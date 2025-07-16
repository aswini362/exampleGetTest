import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> treeset=new TreeSet<>();
        /*treeset.add("A");
        treeset.add(null);
*/
        treeset.add(new String("A"));
        treeset.add(new String("A"));
        treeset.add(new String("E"));treeset.add(new String("C"));


        System.out.println(treeset);

    }

}
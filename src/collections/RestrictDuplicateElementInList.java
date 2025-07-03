package collections;


import java.util.ArrayList;

public class RestrictDuplicateElementInList<E> extends ArrayList<E> {
    @Override
    public boolean add(E e) {
        if (!this.contains(e)) {
            return super.add(e);
        }
        return false;
    }

    public static void main(String[] args) {
        RestrictDuplicateElementInList<String> list = new RestrictDuplicateElementInList<>();
        list.add("One");
        list.add("One");
        list.add("Two");
        list.add("Two");
        System.out.print(list);
    }

}



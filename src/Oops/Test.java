package Oops;

public class Test {
    public static void main(String[] args){
        Parent parent=new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();

        parent.staticMethod();
        childAsParent.staticMethod();
        child.staticMethod();

        parent.instanceMethod();
        childAsParent.instanceMethod();
        child.instanceMethod();
    }
}


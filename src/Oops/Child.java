package Oops;

public class Child extends Parent{

    public static void staticMethod() {
        System.out.println("Static method in Child class");
    }
    @Override
    public void instanceMethod() {
        System.out.println("Instance method in Child class");
    }
}

package Java8;

public interface Vechile {
     void start();
     void stop();
    abstract double area();
    abstract double area2();



     default void honk(){
         System.out.println(" pe pe pe");
     }

     static void maintanice(){
         System.out.println("Bike is Now Maintanice Mode");
     }
}

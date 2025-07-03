package Java8;

public class Bike implements Vechile {

    @Override
    public void start() {
        System.out.println("Bike start");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");
    }

    @Override
    public double area() {
        return 2.0;
    }

    @Override
    public double area2() {
        return 3.0;
    }

    @Override
    public void honk() {
        System.out.println(" whislte ");
    }
}

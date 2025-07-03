package Java8;

public class SingleTon {

    private SingleTon() {}

    private static class SingletonHelper {
        private static final SingleTon INSTANCE = new SingleTon();
    }

    public static SingleTon getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

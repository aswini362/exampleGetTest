package Java8;

public class SingleToon {
    private SingleToon(){

    }

    private static class singletonHelper{
        private static final SingleToon instance=new SingleToon();
    }

    public static SingleToon getInstance(){
        return singletonHelper.instance;
    }

    public static void main(String[] args){
        SingleToon instance = SingleToon.getInstance();
    }
}

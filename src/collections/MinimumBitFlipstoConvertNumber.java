package collections;

public class MinimumBitFlipstoConvertNumber {


    public static void main(String[]args){
        System.out.println(flipsConvertToNumber(10,7));
        System.out.println(flipsConvertToNumber(3,4));
    }

    public static int flipsConvertToNumber(int startGoal,int endGoal){
        int xor=startGoal ^ endGoal;
        int count=0;
        while (xor!=0){
         count +=xor & 1;
            xor >>=1;
        }
        return count;
    }
}

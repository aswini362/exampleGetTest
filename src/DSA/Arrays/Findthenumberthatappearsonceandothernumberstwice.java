package DSA.Arrays;

public class Findthenumberthatappearsonceandothernumberstwice {
    public static void main(String [] args){
     int [] nums={2,2,1};
     System.out.print(singleNumber(nums));
    }
    public static int singleNumber(int [] nums){
        int results=0;

        for(int num:nums){
            results^=num;
        }

        return results;
    }
}

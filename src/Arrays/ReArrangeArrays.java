package Arrays;

public class ReArrangeArrays {

    public static void main(String[] args){

    }
    public static int[] reArrangePositiveAndNegative(int [] arr){
        int n=arr.length;
        int[] result = new int[n];
        int postIndex=0;
        int negativeIndex=1;
        for(int num:arr){
            if(num>1){
                   result[postIndex]=num;
                   postIndex+=2;
            }else{
                result[negativeIndex]=num;
                negativeIndex+=2;
            }
        }
        return result;
    }
}

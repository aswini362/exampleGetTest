package DSA.Arrays;

public class Rearrangethearrayinalternatingpositiveandnegativeitems {

    public static void main(String [] args){
       int [] nums={3,1,-2,-5,2,-4};

       System.out.println(rearrangeArray(nums));
    }

    public static int[] rearrangeArray(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int postIndex=0;
        int negativeIndex=1;
        for(int num:nums){
            if(num>0){
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

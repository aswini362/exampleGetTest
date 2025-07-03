package collections;

public class FindMissingNumberInArrays {

    public static void main(String[] args){
        int[] arr={3,0,1};
        int missingNumberGivenArrays = findMissingNumberGivenArrays(arr);
        System.out.println(missingNumberGivenArrays);
    }

    private static int findMissingNumberGivenArrays(int[] arr) {
        int n=arr.length;
        int expectSum= n * (n + 1) / 2;
        int acctualsum=0;
        for(int num:arr){
            acctualsum+=num;
        }

        return expectSum-acctualsum;
    }
}

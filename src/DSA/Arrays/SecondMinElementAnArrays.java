package DSA.Arrays;

public class SecondMinElementAnArrays {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 2, 4};
        int[] arr1 = {1, 1, 1, 1, 1};
        System.out.println(secondMinElement(arr));
        System.out.println(secondMinElement(arr1));
    }

    public static int secondMinElement(int [] arr){
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for (int num:arr){
            if(num<min){
                secondMin=min;
                min=num;
            } else if (num<secondMin && num!=min) {
                secondMin=num;
            }
        }
        return (secondMin==Integer.MAX_VALUE)?-1:secondMin;
    }
}

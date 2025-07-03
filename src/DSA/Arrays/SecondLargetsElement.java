package DSA.Arrays;

public class SecondLargetsElement {

    public static void main(String [] args){
     int [] arr={12, 35, 1, 10, 34, 1};
     System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int [] arr){
        if(arr.length<2){
            return -1;
        }
        Integer firstNum=Integer.MIN_VALUE;
        Integer secondNum=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>firstNum){
                secondNum=firstNum;
                firstNum=num;
            } else if (num>secondNum && firstNum!=num) {
                secondNum=num;
            }
        }
        if(secondNum==Integer.MIN_VALUE){
            return -1;
        }
        return secondNum;
    }
}

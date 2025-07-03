package collections;

public class FindSecondLargestElementAnArrays {

    public static void main(String [] args){
        int arr[]={10,10,10};
        System.out.println(printSecondLargestNumberAnArrays(arr));
    }

    public static Integer printSecondLargestNumberAnArrays(int[] arr){
       int first=Integer.MIN_VALUE;
       int second=Integer.MIN_VALUE;
       for(int num :arr ){
           if(num>first){
               second=first;
               first=num;
           }if(num >second && num != first){
               second=num;
           }
       }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}

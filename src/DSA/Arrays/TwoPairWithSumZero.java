package DSA.Arrays;

import java.util.ArrayList;

public class TwoPairWithSumZero {

    public static void main(String [] args){
        int [] arr={-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> list = twoPariWithSumZero(arr);
        System.out.println(list);
    }
    public static ArrayList<ArrayList<Integer>> twoPariWithSumZero(int [] arr){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==0){
                    ArrayList<Integer> integerArrayList=new ArrayList<>();
                    integerArrayList.add(arr[i]);
                    integerArrayList.add(arr[j]);
                    list.add(integerArrayList);
                }
            }
        }
        return list;
    }
}

package collections;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {


    public static void main(String[] args){
        int [] num={1,2,3};
         System.out.println(findOutPowerSetOfArrays(num));
    }

    public static List<List<Integer>> findOutPowerSetOfArrays(int [] num){
        List<List<Integer>> results=new ArrayList<>();
        int n=num.length;
        int totalSubSet=1<<n;
        for(int i=0;i<totalSubSet;i++){
            List<Integer> subSets=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1 << j))!=0){
                    subSets.add(num[j]);
                }
            }
            results.add(subSets);
        }
        return results;
    }
}

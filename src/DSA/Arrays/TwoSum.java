package DSA.Arrays;

import java.util.Arrays;


/*
// Store value with original index
int[][] pair = new int[n][2];
    for (int i = 0; i < n; i++) {
pair[i][0] = arr[i];  // value
pair[i][1] = i;       // original index
    }

            // Sort based on values
            Arrays.sort(pair, Comparator.comparingInt(a -> a[0]));
*/

public class TwoSum {

    public static void main(String[] args) {
       int[] nums = {1,1,1,1}; int target = 2;
        int[] ints = twoSumWithTwoPointer(nums, target);
        String string = Arrays.toString(ints);
        System.out.println(string);
    }


    public static int[] twoSumTwoBrute(int [] arr, int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
    }

    public static int[] twoSumWithTwoPointer(int [] arr, int target){
        Arrays.sort(arr);
        //worked on only sorted arrays if there is unsorted arrays first we have sort arr then rest of work
        int n=arr.length;
        int left=0;
        int right=n-1;
        while (left<=right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{left,right};
            } else if (sum<target) {
                left++;
            }else{
                right--;
            }
        }


        return new int[]{};
    }
}

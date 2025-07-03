package Arrays;

public class LongestsubarraywithgivensumK {

    public static void main(String[]args){
        int[] arr = {1, 2, 1, 1, 1};
        int k = 4;
        System.out.print(maxLength(arr,k));
    }

    public static int maxLength(int[]arr,int k){
        int maxLength=0;
        int right=0;int left=0;int sum=0;
        if(arr==null || k<0){
            return 0;
        }
        while (right< arr.length){
            sum+=arr[right];
            while (sum>k && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }


        return maxLength;
    }
}

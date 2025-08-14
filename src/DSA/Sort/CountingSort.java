package DSA.Sort;

public class CountingSort {
    public static void main(String[] args) {
        int [] nums={8 ,14, 3 ,10, 6, 2, 8, 5,9 };
        countingSort(nums);
        for (int num:nums){
            System.out.print(" "+num);
        }

    }

    public static void countingSort(int [] arr){
        int n=arr.length;
        int maxVal=0;
        for(int i=0;i<n;i++){
            maxVal=Math.max(maxVal,arr[i]);
        }
        int[] count=new int[maxVal+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int index=0;
        for(int i=0;i<=maxVal;i++){
            while (count[i]>0){
                arr[index++]=i;
                count[i]--;
            }

        }

    }
}

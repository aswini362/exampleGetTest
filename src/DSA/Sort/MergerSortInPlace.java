package DSA.Sort;

import java.util.ArrayList;
import java.util.List;
                      /*          [6, 3, 8, 5, 2, 7, 4, 1]
                                        /                                \
                                        [6, 3, 8, 5]                            [2, 7, 4, 1]
                                        /              \                         /              \
                                        [6, 3]           [8, 5]                  [2, 7]         [4, 1]
                                        /     \           /     \                 /     \         /     \
                                        [6]    [3]       [8]    [5]            [2]   [7]     [4]   [1]

Merge [6] + [3] = [3, 6]         Merge [8] + [5] = [5, 8]
Merge → [3, 6] + [5, 8] = [3, 5, 6, 8]

Merge [2] + [7] = [2, 7]         Merge [4] + [1] = [1, 4]
Merge → [2, 7] + [1, 4] = [1, 2, 4, 7]

Final Merge:
        [3, 5, 6, 8] + [1, 2, 4, 7] = [1, 2, 3, 4, 5, 6, 7, 8]
*/

public class MergerSortInPlace {
    public static void main(String...args){
        int []arr={6, 3, 8, 5, 2, 7, 4, 1};
        mergeSort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
    public static void mergeSort(int []arr,int low,int high){
        if(low>=high) {
            return;
        }
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, mid, low, high);


    }

    public static void merge(int []arr,int mid,int low,int high){
        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        }
        while (left<=mid){
            temp.add(arr[left++]);
        }while (right<=high){
            temp.add(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i - low);
        }
    }
}

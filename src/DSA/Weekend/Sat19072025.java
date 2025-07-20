package DSA.Weekend;

import java.util.ArrayList;
import java.util.List;

public class Sat19072025 {

    public static void main(String...args){
     /*System.out.println(countDigits(77781));
     System.out.println(sumOfDigits(77781));*/
     //System.out.println(subtractProductAndSum(234));
        //System.out.println(CounTTheDigitsThatDivideANumber(124));
       // System.out.println(addDigits(38));
       // System.out.println(reverseNumber(123));
       int[] arr={23,12,16,32,1,67,43,32};
        quickSort(arr,0,arr.length-1);
        for (int num:arr){
            System.out.print(" "+num);
        }
    }
      public static int countDigits(int n){
        int cnt=0;
        while(n>0){
            int lastDigits = n % 10;
            cnt++;
            n=n/10;
        }
        return cnt;
      }

    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int lastDigits = n % 10;
            sum+=lastDigits;
            n=n/10;
        }
        return sum;
    }

    public static int subtractProductAndSum(int n){
       int multiply=1;
       int digitSum=0;
       int subtracts;
       while (n>0){
           int lastDigits = n % 10;
           digitSum+=lastDigits;
           multiply*=lastDigits;
           n = n / 10;
       }
       subtracts=multiply-digitSum;
       return subtracts;
    }

    public static int CounTTheDigitsThatDivideANumber(int num){
        int count=0;
        int original=num;
        while (num>0){
            int lastDigits = num % 10;
            if( lastDigits!=0  && original%lastDigits==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }

    public static int addDigits(int num){
        while (num>=10){
            int sum=0;
            while (num>0){
                int lastDigits=num%10;
                sum+=lastDigits;
                num=num/10;
            }
           num=sum;
        }
        return num;
    }

    public static int numberStepsZero(int num){
        int countSteps=0;
        while (num>0){
            if(num%2==0){
                num= num / 2;
            }else{
                num=-1;
            }
            countSteps++;
        }
        return countSteps;
    }

    public static int reverseNumber(int num){
        int rev=0;
        int sign=num>0 ? 1:-1;
        num=Math.abs(num);
        while (num>0){
            int digits=num%10;
            rev=rev*10+digits;
            num=num/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return rev*sign;
    }


    public static void mergeSort(int [] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,mid,low,high);
    }

    public static void merge(int[] arr,int mid,int low,int high){
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
        }
        while (right<=high){
            temp.add(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }

    public static void bubbleSort(int arr[]){
        boolean isSwapped=false;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)
                break;
        }
    }

    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int partitonindex = partitonindex(arr, low, high);
            quickSort(arr,low,partitonindex-1);
            quickSort(arr,partitonindex+1,high);
        }


    }
    public static int partitonindex(int[] arr,int low,int high){
            int piviot=arr[high];
            int i=low-1;
            for(int j=low;j<high;j++){
                if(arr[j]<=piviot){
                    i++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;

        return i+1;
    }

}

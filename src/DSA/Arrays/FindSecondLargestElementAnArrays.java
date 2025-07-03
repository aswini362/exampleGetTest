package DSA.Arrays;

public class FindSecondLargestElementAnArrays {

    public static void main(String[] args){
        int[] arr = {10, 5, 20, 8, 3};
        System.out.println("Second Largest Element: " + secondLargest(arr));

        /*int[] arr = {20, 20, 10, 10};

        // Convert to distinct, boxed, and sorted in descending order
        List<Integer> sortedDistinct = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        if (sortedDistinct.size() < 2) {
            System.out.println("No second largest element found (all elements may be equal)");
        } else {
            System.out.println("Second Largest Element: " + sortedDistinct.get(1));
        }
    }*/
    }

    public static int secondLargest(int[] nums){

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>first){
                second=first;
                first=num;
            } else if (num>second && num!=first) {
                second=num;
            }
        }
        return second;
    }
}

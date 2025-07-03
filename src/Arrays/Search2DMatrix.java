package Arrays;

public class Search2DMatrix {


    public static void main(String[] args){
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 61;
        System.out.println(searchMatrix(matrix, target));
    }
    
    public static Boolean searchMatrix(int [][] matrix,int target){
        int m= matrix.length;
        int n = matrix[0].length;
        int right=m*n-1;
        int left=0;
        while (left<=right){
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / n][mid % n];
            if(midValue==target){
                return true;
            }else if (midValue < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}

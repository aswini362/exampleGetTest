package DSA.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height=   {1,8,6,2,5,4,8,3,7};
        System.out.println(maxAreaWithTwoPointer(height));
    }


    public static int maxArea(int[] height) {
        int maxAreaWaterContains=0;
        int n=height.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int h=Math.min(height[i],height[j]);
                int width=j-i;
                int area=h*width;
                maxAreaWaterContains=Math.max(maxAreaWaterContains,area);
            }
        }


        return maxAreaWaterContains;
    }

    public static int maxAreaWithTwoPointer(int [] height){
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while (left<right){
            int h=Math.min(height[left],height[right]);
            int width=right-left;
            int area=h*width;
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;
        int currentarea = 0;

        while(left < right){
            currentarea = Math.min(height[left], height[right])*(right - left);
            maxArea = Math.max(maxArea, currentarea);
            if(height[left] > height[right]){
                right--;
            }
            else left++;
        }
        return maxArea;

    }
}

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));
        
    }
}

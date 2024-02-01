
public class LeetCode1{
       public static int[] twoSum(int[] nums, int target) {

        int arr[] = new int[2]; 
        // int arr[] = {};
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    arr[m] = i;
                    m++;
                    arr[m] = j;
                }
            }
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        int target = 6;
        int res[] = twoSum(arr, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
            
        }
    }
}
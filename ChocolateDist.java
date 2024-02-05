import java.util.Arrays;
// diffrence between lowest and bigest 
public class ChocolateDist {
    public static int diff(int nums[],int m){
        Arrays.sort(nums);
        int res = nums[m-1] - nums[0];
        return res;
    }
    public static void main(String[] args) {
        int arr[]  = {14,3,7,29,98,65,10,64};
        System.out.println(diff(arr, 4));

    }
}

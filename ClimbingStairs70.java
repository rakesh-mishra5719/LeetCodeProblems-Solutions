public class ClimbingStairs70 {

    
    public static int climbStairs(int n) {
        int ways = 1;
        for(int i = 1;i <= n/2; i++){
            int sum =  1;
            for (int j = i; j < 2 * i; j++) {
                sum *= (n-j) / (j-i +1);
            }
            ways += sum;
        }
        return ways;
    }

    public static void main(String[] args) {
        
        int res = climbStairs(4);
        System.out.println(res);

    }
}

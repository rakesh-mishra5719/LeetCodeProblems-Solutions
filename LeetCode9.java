public class LeetCode9 {
      public static boolean isPalindrome(int x) {
        int temp = x;
        int sum =0,rem = 0;
        while(x>0){
            rem = x%10;
            sum = rem +sum*10;
            x=x/10;
            System.out.println(sum);

        }
        if(sum==temp){
            return true;
        }
        else return false;
        
    }

    public static void main(String[] args) {

        boolean res = isPalindrome(12);
        System.out.println(res);
        
    }
}

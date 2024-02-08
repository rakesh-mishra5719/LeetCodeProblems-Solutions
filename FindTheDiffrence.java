import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr1 =  s.toCharArray();
        char[] arr2 = t.toCharArray();
        Character ch = ' ';
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        for (i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
             return arr2[i];
            }
           
        }
        ch = arr2[i];
        return ch;


    }
}

public class FindTheDiffrence {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.findTheDifference("abcd", "abecd"));
    }
}

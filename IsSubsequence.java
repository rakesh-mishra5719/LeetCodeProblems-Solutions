class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;


        while(i<s.length() && j< t.length()){
            if(s.charAt(i) == t.charAt(j)){
                
                i++;
                j++;
                
            }
            else j++;

        }
        return i ==s.length();
    }
}

public class IsSubsequence {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isSubsequence("aaaaabc", "ahbgdc"));
    }
}

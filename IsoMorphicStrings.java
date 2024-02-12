import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

         HashMap<Character,Character>mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            
            
            if(mp.containsKey(s.charAt(i))){
                if(mp.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            } else if (mp.containsValue(t.charAt(i))) {
                System.out.println(" contain space");
                return false;
            } else{
                mp.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;

    }

}

public class IsoMorphicStrings {
    public static void main(String[] args) {
        Solution obj  = new Solution();
        System.out.println(obj.isIsomorphic("egg", "add"));
    }
}

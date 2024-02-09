import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();

       for(String word : strs){
           char[] chars = word.toCharArray();
           Arrays.sort(chars);
           String sortedWord = new String(chars);

           if(!map.containsKey(sortedWord)){
               map.put(sortedWord, new ArrayList<>());
           }

           map.get(sortedWord).add(word);

       } 
       return new ArrayList<>(map.values());
    }
}

public class GroupAnagram {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj.groupAnagrams(strs));
    }
}

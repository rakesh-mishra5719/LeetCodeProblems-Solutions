public class FirstOccurenceSubstring {

    public static int countOccurrences(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        int j = 0;
        for(int i=0; i<hLen; i++){
            
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            else{
                
                i=i-j;
               
                j=0;
            }
            
            if(j==nLen){
              
                return i-nLen+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "rakeshkeshu";
        String pattern = "keshu";

        int index = countOccurrences(text, pattern);
        System.out.println(index);
    }

}


public class Solution {
    public int lengthOfLastWord(String s) {
        int len;
        String[] words = s.split(" ");
        int n = words.length;
        if(n>0){
            String lastWord = words[n-1];
            len = lastWord.length();
            
        }
        else{
            len = 0;
        }
    
        
        return len;
        
    }
}

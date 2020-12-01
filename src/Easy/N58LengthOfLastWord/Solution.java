package Easy.N58LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String [] arrayS= s.split(" ");
        if(arrayS.length == 0){
            return 0;
        }
        char [] charS = arrayS[arrayS.length-1].toCharArray();
        return charS.length;
    }
}

package Easy.N58LengthOfLastWord;

public class Solution2 {
    public int lengthOfLastWord(String s) {
        char [] arrayS= s.toCharArray();
        int lastSpace =0;
        boolean change = true;
        for (int i = arrayS.length-1; i >= 0; i--) {
            if((arrayS[i] == ' ')&& change){
                lastSpace++;
            }else{
                change = false;
                if(arrayS[i] == ' '){
                    return arrayS.length-1-lastSpace-i;
                }
            }
        }


        return arrayS.length-lastSpace;
    }
}

package Easy.N771JewelsAndStones;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        char [] Array_J= J.toCharArray();
        char [] Array_S =S.toCharArray();
        int n =0;
        int n1=Array_J.length;
        int n2=Array_S.length;
        for(int i=0;i<n1;i++){
            for(int j=0; j<n2;j++){
                if(Array_J[i]==(Array_S[j]))
                {
                    n++;
                }
            }
        }
        return n;
    }
}

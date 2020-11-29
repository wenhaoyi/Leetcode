package Easy.N771JewelsAndStones;


import java.util.HashSet;

import java.util.Set;

public class Solution3 {
    public int numJewelsInStones(String J, String S) {
        char [] Array_J= J.toCharArray();
        char [] Array_S =S.toCharArray();
        Set setJ= new HashSet();
        int n =0;
        int n1=Array_J.length;
        int n2=Array_S.length;
        for (int i = 0; i < n1; i++) {
            setJ.add(Array_J[i]);

        }
        for(int j=0; j<n2;j++){
            if(setJ.contains(Array_S[j]))
            {
                n++;
            }
        }
        return n;

    }
}

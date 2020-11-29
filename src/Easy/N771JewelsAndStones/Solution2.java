package Easy.N771JewelsAndStones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Solution2 {
    public int numJewelsInStones(String J, String S) {
        String [] Array_J= J.split("");
        String [] Array_S =S.split("");
        Map mapJ= new HashMap();

        int n =0;
        int n1=Array_J.length;
        int n2=Array_S.length;
        for (int i = 0; i < n1; i++) {
            mapJ.put(i, Array_J[i]);

        }
        for(int j=0; j<n2;j++){
            if(mapJ.containsValue(Array_S[j]))
            {
                n++;
            }
        }
        return n;

    }
}

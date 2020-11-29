package Easy.N13RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int outputTotal =0;
        char [] Array_S= s.toCharArray();
        Map map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i = 0; i < Array_S.length-1; i++) {
            if ((Integer) map.get(Array_S[i]) < (Integer) map.get(Array_S[i+1])) {
                outputTotal-= (Integer) map.get(Array_S[i]);
            }else{
                outputTotal+= (Integer) map.get(Array_S[i]);
            }
        }
        outputTotal+= (Integer) map.get(Array_S[Array_S.length-1]);
        return outputTotal;
    }
}

package Easy.N66PlusOne;

import java.lang.reflect.Array;

public class Solution {
    public int[] plusOne(int[] digits) {
        boolean move = false;
        int output [] = digits;
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i]!=9){
                digits[i]++;
                output = digits;
                break;
            }else{
                digits[i]=0;
                if(i==0){
                    int[] output2 = new int[digits.length + 1];
                    output2[0]=1;
                    for (int j = 0; j < digits.length; j++) {
                        output2[j+1] = digits[j];
                    }
                   return output2;
                }
            }
        }
        return output;
    }
}

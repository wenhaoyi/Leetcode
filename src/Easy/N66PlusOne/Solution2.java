package Easy.N66PlusOne;

import java.util.Arrays;

public class Solution2 {
    public int[] plusOne(int[] digits) {
      int  len = digits.length;
        for (int i = len-1; i >=0; i--) {
            digits[i]++;
            digits[i] = digits[i]%10;
            if(digits[i]!=0){
                return digits;
            }
        }
        digits = new int[len+1];
        System.out.println(Arrays.toString(digits));
        digits[0]=1;
        return digits;
    }
}

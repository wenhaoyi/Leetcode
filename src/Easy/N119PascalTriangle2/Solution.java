package Easy.N119PascalTriangle2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> generate(int rowIndex) {
        List<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < rowIndex+1; i++) {
            List row = new ArrayList<Integer>();
            for (int j = 0; j <=i; j++) {
                if(j==0||j==i){
                    row.add(1);
                }else{
                    row.add(output.get(j - 1) + output.get(j));
                }
            }
            output= row;
        }
        return output;
    }
}

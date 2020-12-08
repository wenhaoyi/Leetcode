package Easy.N118PascalTriangle;

import java.util.*;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> output = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List row = new ArrayList<Integer>();
            for (int j = 0; j <=i; j++) {
                if(j==0||j==i){
                    row.add(1);
                }else{
                    row.add(output.get(i - 1).get(j - 1) + output.get(i - 1).get(j));
                }
            }
            output.add(row);
        }
        return output;
    }
}

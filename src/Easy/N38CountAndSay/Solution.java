package Easy.N38CountAndSay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String countAndSay(int n) {
        String printout="";

        if(n==1||n==0){
            return "1";
        }
        List temp1 = new ArrayList<Integer>();
        temp1.add(1);
        for (int i = 1; i < n; i++) {
            int count = 0;
            List temp2 = new ArrayList<Integer>(temp1);
            temp1.clear();
            for (int j = 0; j < temp2.size(); j++) {
                if(j==0){
                    count++;
                }else if((int) temp2.get(j-1) == (int) temp2.get(j)){
                   count++;
                }else{
                    temp1.add(count);
                    temp1.add((int) temp2.get(j-1));
                    count = 1;
                }
                if(j==temp2.size()-1){
                    temp1.add(count);
                    temp1.add((int) temp2.get(j));
                    count = 0;
                }
//0                for (int k = 0; k < temp1.size(); k++) {
//                    printout += temp1.get(k);
//                }
//                System.out.println("----"+printout);
            }
        }
        String output = new String();
        for (int i = 0; i < temp1.size(); i++) {
            output += temp1.get(i);
        }


    return output;
    }
}

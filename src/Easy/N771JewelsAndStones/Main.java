package Easy.N771JewelsAndStones;

import Easy.N771JewelsAndStones.Solution;

public class Main {
    public static void main(String[] args) {
        String inputJ ="z" ;
        String inputS = "ZZ";
        Solution3 solution = new Solution3();
        int output = solution.numJewelsInStones(inputJ,inputS);
        System.out.println(output);
    }
}

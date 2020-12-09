package Easy.N167TwoSum2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] input1 = {0,0,3,4};
        int input2 = 0;
        Solution solution = new Solution();
        int [] output = solution.twoSum(input1,input2);
        System.out.println(Arrays.toString(output));
    }
}

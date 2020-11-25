package Easy.N1TwoSum;

import java.util.Arrays;
import Easy.N1TwoSum.Solution;
public class Main {
    public static void main(String[] args) {
        int [] inputArray = {2,7,11,15};
        int inputInt = 9;
        Solution solution = new Solution();
        int [] output = solution.twoSum(inputArray, inputInt);
        System.out.println(Arrays.toString(output));
    }
}

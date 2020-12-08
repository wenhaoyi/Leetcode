package Easy.N66PlusOne;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = {9,9};
        Solution2 solution = new Solution2();
        int[] output = solution.plusOne(input);
        System.out.println(Arrays.toString(output));
    }
}

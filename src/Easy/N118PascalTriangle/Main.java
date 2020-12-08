package Easy.N118PascalTriangle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int input = 5;
        List<List<Integer>> output = null;
        Solution solution = new Solution();
        output = solution.generate(input);
        System.out.println(output);
    }
}

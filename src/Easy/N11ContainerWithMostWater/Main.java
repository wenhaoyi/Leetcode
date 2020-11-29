package Easy.N11ContainerWithMostWater;

import Easy.N11ContainerWithMostWater.Solution;
import Easy.N11ContainerWithMostWater.Solution2;

public class Main {
    public static void main(String[] args) {
        int [] inputInt = {1,8,6,2,5,4,8,3,7};
        Solution2 solution = new Solution2();
        int output = solution.maxArea(inputInt);
        System.out.println(output);
    }
}

package Middle.N11ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int size = height.length;
        int [] output = {0,0};
        int cal = 0;
        int max = 0;
        int heightuse =0;
        for (int i = 0; i < size; i++) {
            for (int j = size-1; j > i; j--) {
                cal = Math.min(height[i], height[j]) * (j - i);
                max=  Math.max(cal,max);
            }
        }
        return max;
    }
}

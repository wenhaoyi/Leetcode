package Middle.N11ContainerWithMostWater;

public class Solution2 {
    public int maxArea(int[] height) {
    int i = 0, j = height.length-1;
    int max = 0;
        while(i < j){
        int temp;
        if(height[i] > height[j]){
            temp = height[j];
            if(max < temp*(j-i)){
                max = temp*(j-i);
            }
            j--;
        }else{
            temp = height[i];
            if(max < temp*(j-i)){
                max = temp*(j-i);
            }
            i++;
        }
    }
        return max;
}
}

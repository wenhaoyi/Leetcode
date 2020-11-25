package Middle;

public class N11ContainerWithMostWater {
    public static <integer> void main(String[] args) {
        // write your code here
        int [] arrayTest = {1,8,6,2,5,4,8,3,7};
        int  output = maxArea2(arrayTest);
        System.out.println(output);
    }
    static public int maxArea3(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }
    static public int maxArea1(int[] height) {
        int size = height.length;
        int [] output = {0,0};
        int cal = 0;
        int max = 0;
        int heightuse =0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j<=i){
                    continue;
                }
                cal = Math.min(height[i], height[j]) * (j - i);
                max=  Math.max(cal,max);
            }
        }
        return max;
    }

    static public int maxArea2(int[] height){
        int heightSize = height.length-1;
        int i = 0, j = heightSize;
        int max = 0;
        while(i < j){
            int temp;
            if(height[i] > height[j]){
                temp = height[j];
                if(max < temp*(j-i)){
                    max = temp*(j-i);
                    // System.out.println("i:"+i+" j:"+j+" max:"+max);
                }
                j--;
            }else{
                temp = height[i];
                if(max < temp*(j-i)){
                    max = temp*(j-i);
                    // System.out.println("i:"+i+" j:"+j+" max:"+max);
                }
                i++;
            }
        }
        return max;
    }
}

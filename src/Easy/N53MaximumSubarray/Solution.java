package Easy.N53MaximumSubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int output = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int total = 0;
            int min = nums[i];
            for (int j = i; j < nums.length; j++) {
                total += nums[j];
              //  System.out.println("min:"+min+", total:"+(total));
                min = Math.max(min,total);
            }
           // System.out.println(min);
            output = Math.max(output,min);
        }
    return output;
    }
}

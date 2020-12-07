package Easy.N35SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int output = 0;
        if(nums == null || nums.length == 0){
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < target){
                output ++;
            }else{
                return output;
            }
        }
        return output;
    }
}

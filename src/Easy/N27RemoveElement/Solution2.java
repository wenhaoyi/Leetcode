package Easy.N27RemoveElement;

public class Solution2 {
    public int removeElement(int[] nums, int val) {
        if (nums == null){
            return  0;
        }
        int output=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                for (int j = nums.length-1; j >i ; j--) {
                    if(nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        output++;
                        break;
                    }
                }
            }else{
                output ++;
            }
        }
        return output;
    }
}

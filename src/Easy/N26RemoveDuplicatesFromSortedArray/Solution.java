package Easy.N26RemoveDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Set set = new HashSet();
        int [] output = new int[0];
        if (nums.length <= 1) {
            return nums.length;
        }
        int size = nums.length;
        set.add(nums[0]);
        for (int i = 1; i < size; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                for (int j = i; j < size-1; j++) {
                    nums[j] = nums[j+1];
                }
                i--;
                size--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i+": "+nums[i]);
        }


        return size;
    }
}

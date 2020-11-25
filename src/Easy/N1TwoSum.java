package Easy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class N1TwoSum {
    public static void main(String[] args) {
        int [] inputArray = {2,7,11,15};
        int inputInt = 9;
        twoSum(inputArray,inputInt);
        System.out.println(Arrays.toString(twoSum(inputArray,inputInt)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}

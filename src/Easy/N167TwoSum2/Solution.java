package Easy.N167TwoSum2;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int [] output = {1,1};
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if((numbers[i]+numbers[j])==(target)){
                    output[0] =i+1;
                    output[1] =j+1;
                    return output;
                }
            }
        }
        return output;
    }
}

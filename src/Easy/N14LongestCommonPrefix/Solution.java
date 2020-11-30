package Easy.N14LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null|| strs.length == 0){
            return "";
        }
        int inputSize = strs.length;
        if (inputSize==1){
            return strs[0];
        }
        char[] charArray2 = new char[0];
        String output = "";
        char[] outputArray  = strs[0].toCharArray();
        for (int i = 1; i < inputSize; i++) {
            output="";
            charArray2  = strs[i].toCharArray();
            int minLength = Math.min(outputArray.length,charArray2.length);
            if (minLength == 0) {
                return "";
            }
            for (int j = 0; j < minLength; j++) {
                if (outputArray[j] == charArray2[j]) {
                    output+=outputArray[j];
                    //System.out.println(output);
                }else{
                    outputArray = output.toCharArray();
                    break;
                }
                if (j == minLength-1) {
                    outputArray = output.toCharArray();
                }
            }
        }
        output ="";
        for (int i = 0; i < outputArray.length; i++) {
            output += outputArray[i];
        }
        return output;

    }
}

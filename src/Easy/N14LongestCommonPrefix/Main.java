package Easy.N14LongestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        String [] inputStringArray ={"abab","aba",""} ;
        Solution solution = new Solution();
        String output = solution.longestCommonPrefix(inputStringArray);
        System.out.println(output);
    }
}

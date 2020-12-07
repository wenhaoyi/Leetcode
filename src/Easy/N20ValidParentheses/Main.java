package Easy.N20ValidParentheses;


import Easy.N771JewelsAndStones.Solution3;

public class Main {
    public static void main(String[] args) {
        String input ="([)]";
        Solution solution = new Solution();
        boolean output = solution.isValid(input);
        System.out.println(output);
    }
}

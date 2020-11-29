package Easy.N9PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        int out =0;
        int input = x;
        int end = 0;
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        while( x!=0) {
            end = x%10;
            x /= 10;
            out= out*10+end;
        }
        if(input!=out){
            return false;
        }

        return true;
    }

}

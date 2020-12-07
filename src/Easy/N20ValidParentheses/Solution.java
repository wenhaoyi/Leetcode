package Easy.N20ValidParentheses;

public class Solution {
    public boolean isValid(String s){
        int a = 0;
        int b = 0;
        int c = 0;
        char d = ' ';

        char [] charArray= s.toCharArray();
        int n =0;
        for(int i=0;i< charArray.length;i++){
            d = charArray[i];
            if(d == '('){
                a += 1 ;
            }
            if(d == '['){
                b += 1 ;
            }
            if(d == '{'){
                c += 1 ;
            }
            if(d == ')'){
                a -= 1 ;
            }
            if(d == ']'){
                b -= 1 ;
            }
            if(d == '}'){
                c -= 1 ;
            }
            if(a<0 | b<0 | c<0){
                return false;
            }
        }
        if(a==0 && b==0 && c==0){
           return true;
        }

        return false;
    }
}

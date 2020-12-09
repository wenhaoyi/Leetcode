package Easy.N38CountAndSay;
//redo of solution2
public class Solution3 {
    public String countAndSay(int n) {
     if(n==1){
         return "1";
     }
     StringBuffer sb = new StringBuffer();
     String str = countAndSay(n-1);
     int length = str.length();
     int start = 0;
        for (int i = 0; i < length+1; i++) {
            if(i==length){
                sb.append(i-start).append(str.charAt(start));
            }else if(str.charAt(start)!=str.charAt(i)){
                sb.append(i-start).append(str.charAt(start));
                start =i;
            }
        }
        return sb.toString();

    }
}

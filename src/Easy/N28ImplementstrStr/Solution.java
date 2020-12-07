package Easy.N28ImplementstrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            if (needle.length() != 0) {
                return -1;
            }else {
                return 0;
            }
        }

        char [] haystackChar = haystack.toCharArray();
        char [] needleChar = needle.toCharArray();
        int size1 = haystackChar.length;
        int size2 = needleChar.length;
        for (int i = 0; i < size1-size2+1; i++) {
            if(haystackChar[i]==(needleChar[0])){
                for (int j = 0; j < size2; j++) {
                    if(haystackChar[i+j]==(needleChar[j])){
                        if(j==size2-1){
                            return i;
                        }
                        continue;
                    }
                    break;
                }


            }
        }
        return -1;


    }
}

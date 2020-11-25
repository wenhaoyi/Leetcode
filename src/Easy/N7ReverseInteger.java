package Easy;

public class N7ReverseInteger {
    public static void main(String[] args) {
        int inputInt =123456789;
        System.out.println(reverse(inputInt));
    }
    public static int reverse(int x) {
        int end = 0  ;
        int i = 0;
        int out = 0;
        while(x!=0) {
            end = x%10;
            x /= 10;
            if((i==9) && (out>(Integer.MAX_VALUE/10) || out<(Integer.MIN_VALUE/10) )) {
                return 0;
            }else
            {
                out= out*10+end;
            }
            i++;
        }
        return out;
    }
}

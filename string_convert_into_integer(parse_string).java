import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
        public static void is_Balanced(String str) {
        int n = str.length(), pwr = 1, res = 0;
        for(int i = n-1; i >= 0; i--){
            char ch = str.charAt(i);
            int d = ch - '0';
            res += d*pwr;
            pwr *= 10;
        }
        System.out.println(res + 5);
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        is_Balanced(str);
    }
}
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean is_capital(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
    public static boolean detect_capital_use(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (is_capital(ch))
                count++;
        }
        if (count == n || count == 0)
            return true;
        else if (count == 1 && is_capital(str.charAt(0)))
            return true;

        return false;
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(detect_capital_use(str));
    }
}    
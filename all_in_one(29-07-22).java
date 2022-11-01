import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int count_lower_case(){
        String a = scn.nextLine();
        int c = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                c++;
            }
        }
        return c;
    }
    public static int count_upper_case(){
        String a = scn.nextLine();
        int c = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
                c++;
            }
        }
        return c;
    }
    public static String lower_case_to_upper(){
        String a = scn.nextLine();
        String b = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                b += (char)(a.charAt(i)-'a'+'A');
            }
        }
        return b;
    }
    public static String upper_case_to_lower(){
        String a = scn.nextLine();
        String b = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
                b += (char)(a.charAt(i)-'A'+'a');
            }
        }
        return b;
    }
    public static String print_toggle_case(){
        String a = scn.nextLine();
        String b = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
                b += (char)(a.charAt(i)-'A'+'a');
            }
            else if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                b += (char)(a.charAt(i)-'a'+'A');
            }
        }
        return b;
    }
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
        // System.out.println(count_lower_case());
        // System.out.println(count_upper_case());
        // System.out.println(lower_case_upper_case());
        // System.out.println(upper_case_to_lower());
        // System.out.println(print_toggle_case());
        System.out.println(detect_capital_use(str));
    }
}
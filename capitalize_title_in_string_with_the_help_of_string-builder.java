import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String lower_case(String str) {
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans.append((char) (ch - 'A' + 'a'));
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static String capitalize_title(String title) {
        String[] arr = title.split(" ");
        StringBuilder ans = new StringBuilder();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            if (str.length() <= 2)
                ans.append(lower_case(str));
            else {
                char ch = str.charAt(0);
                if (ch >= 'a' && ch <= 'z')
                    ch = (char) (ch - 'a' + 'A');
                ans.append(ch + lower_case(str.substring(1)));
            }
            if (i != n - 1)
                ans.append(" ");
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String s = scn.nextLine();
        System.out.println(capitalize_title(s));
    }
}    
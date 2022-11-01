import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String[] split(String str, char regex_ch) {
        ArrayList<String> list = new ArrayList<>(); // for whithout arraylist count regex_ch, count + 1 -> string[]

        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch != regex_ch)
                sb.append(ch);

            if (ch == regex_ch || i == n - 1) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        String[] ans = new String[list.size()];
        int i = 0;
        for (String s : list)
            ans[i++] = s;

        return ans;
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        String[] arr = split(str, ' ');
        for (String s : arr)
            System.out.println(s);
    }
}    
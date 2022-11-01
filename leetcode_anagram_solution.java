import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int n = a.length;
        int m = b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int c = 0;
        if(n != m)
            return false;
        else{
            for(int i = 0; i < n; i++){
                if(a[i] == b[i])
                    c++;
            }
            if(c != n)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str_1 = scn.nextLine();
        String str_2 = scn.nextLine();
        System.out.println(isAnagram(str_1, str_2));
    }
}
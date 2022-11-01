import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean is_vowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void absolute_Diff(String str) {
        int maximum = -1;
        int minimum = 10000000;
        int c = 0;
        int idx = -1, prev_Idx = -10000000, n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (is_vowel(ch)) {
                if (idx == -1) {
                    idx = i;
                }
                maximum = Math.max(maximum, i - idx);
                minimum = Math.min(minimum, i - prev_Idx);
                prev_Idx = i;
                c++;
            }
        }
        if (count > 1) {
            System.out.println("maximum diff: " + maximum);
            System.out.println("minimum diff: " + minimum);
        } else {
            System.out.println("error: No Answer exist for this string, if you want valid answer then enter minimum 2 vowel in string.");
        }
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        absolute_Diff(str);
    }
}    
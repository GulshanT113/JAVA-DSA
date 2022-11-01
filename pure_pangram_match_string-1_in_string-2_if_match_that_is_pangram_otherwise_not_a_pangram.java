import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String remove_All_Duplicates(String str) {
        int[] freq = new int[128];
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append((char) i);
            }
        }
        return sb.toString();
    }
    public static void is_panagram(String str1, String str2) {
        int c = 0;
        String a = remove_All_Duplicates(str1);
        String b = remove_All_Duplicates(str2);
        int n = a.length();
        int m = b.length();
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a.charAt(i) == b.charAt(j))
                c++;
            }
        }
        if(c != n)
        System.out.println("Not a Pangram");
        else
        System.out.println("Pangram");
    }
    public static void main(String[] args){
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        is_panagram(str1, str2);
    }
}
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String make_String(char ch, int freq){
        StringBuilder sb = new StringBuilder();
        while (freq-- > 0) {
            sb.append(ch);
        }
        return sb.toString();
    }
    public static String sort_String(String str) {
        int[] freq = new int[128];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append(make_String((char) i, freq[i]));
            }
        }
        return sb.toString();
    }
    public static boolean is_panagram(String str1, String str2) {
        String s1 = sort_String(str1);
        String s2 = sort_String(str2);
        int c = 0;
        for(int i = 0; i < s1.length()-1; i++){
            for(int j = 0; j < s2.length()-1; j++){
                if(s1.charAt(i) == s2.charAt(j))
                c++;
            }
            if(c == s2.length()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        System.out.println(is_panagram(str1, str2));
    }
}

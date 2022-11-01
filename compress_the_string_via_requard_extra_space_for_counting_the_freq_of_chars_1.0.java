import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String compress(String str) {
        int[] freq = new int[128];
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append((char) i);
                if (freq[i] > 1)
                    sb.append(freq[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(compress(str));
    }
}

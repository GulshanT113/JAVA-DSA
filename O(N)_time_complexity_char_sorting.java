import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String make_String_sort(char ch, int freq) {
        StringBuilder sb = new StringBuilder();
        while (freq-- > 0) {
            sb.append(ch);
        }
        return sb.toString();
    }
    public static String string_Sorting(String str) {
        int[] freq_Array = new int[128];
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq_Array[ch] += 1;
        }
        for (int i = 0; i < 128; i++) {
            if (freq_Array[i] > 0) {
                sb.append(make_String_sort((char) i, freq_Array[i]));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(string_Sorting(str));
    }
}    
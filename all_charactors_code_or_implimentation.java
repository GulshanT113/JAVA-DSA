import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void freq_Array(String str) {
        int[] f_Arr = new int[128 + 1];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            f_Arr[ch++] = f_Arr[ch] + 1; // ch -> int (ASCII)oidsn
        }
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char) i + " -> " + f_Arr[i]);
        }
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        freq_Array(str);
    }
}
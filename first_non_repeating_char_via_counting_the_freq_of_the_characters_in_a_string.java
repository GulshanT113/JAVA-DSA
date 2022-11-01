import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int first_Non_Repeating_Character(String str) {
        int[] freq = new int[128];
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.print("the frist non repeating char is '" + str.charAt(i) + "' and the location is = ");
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println("Statement : in this string it returns a frist non repeating character.");
        String str = scn.nextLine();
        System.out.println(first_Non_Repeating_Character(str));
    }
}
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean is_Vowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static boolean is_Contain_Vowel(String str) {
        for(int i = 0; i < str.length(); i++) {
            if (is_Vowel(str.charAt(i)))
                return true;
        }
        return false;
    }
    public static int count_All_Non_Vowel_Substrings(String str) {
        int count = 0, n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String substr = str.substring(i, j + 1);
                System.out.println(substr); //show, how much time substring present without vowel character.
                if (is_Contain_Vowel(substr) == false)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println("Statement : Non vowel substring count.");
        String str = scn.nextLine();
        System.out.println(count_All_Non_Vowel_Substrings(str));
    }
}
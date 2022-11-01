import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean small_vowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static boolean large_vowel(char ch){
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public static int count_vowel(String str){
        int n = str.length(), c = 0;
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(small_vowel(ch) || large_vowel(ch))
            c++;
        }
        return c;
    }
    public static int count_constant(String str){
        int n = str.length(), c = 0;
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(!small_vowel(ch) && !large_vowel(ch))
            c++;
        }
        return c;
    }
    public static void print_reverse(String str){
        int n = str.length();
        for(int i = n-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void alter_nate(String str){
        int n = str.length();
        for(int i = 0; i < n; i += 2){
            System.out.print(str.charAt(i));
        }
    }
    public static int count_space(String str){
        int n = str.length(), c = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == ' ')
            c++;
        }
        return c;
    }
    public static void mul_of_3(String str){
        int n = str.length();
        System.out.println(n % 3 == 0 ? "yes" : "no");
    }
    public static void print_pair_of_3(String str){
        int n = str.length();
        int idx = 0;
        while(n >= 3){
            System.out.println(str.substring(idx, idx + 3));
            idx += 2;
            n -= 2;
        }
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(count_vowel(str));
        // System.out.println(count_constant(str));
        // print_reverse(str);
        // alter_nate(str);
        // System.out.println(count_space(str));
        // mul_of_3(str);
        // print_pair_of_3(str);
    }
}
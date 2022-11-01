import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void print_1(String str){
        int n = str.length();
        int c = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                String substr = str.substring(i, j + 1);
                int m = substr.length();
                if(substr.charAt(0) == substr.charAt(m-1))
                c++;
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        String str = scn.nextLine();
        print_1(str);
    }
}
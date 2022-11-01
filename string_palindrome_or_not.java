import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static boolean is_Plaindrome(String str) {
        int n = str.length();
        int i = 0, j = n-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(is_Plaindrome(str));
    }
}
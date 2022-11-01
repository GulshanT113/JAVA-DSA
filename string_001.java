import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern_string(String str){
        char ch = str.charAt(6);
        System.out.println(ch);
        int len = str.length();
        System.out.println(len);
        str += "good_bye";
        System.out.println(str);
        str = str.substring(3);
        System.out.println(str);
        str = str.substring(4, 8);
        System.out.println(str);
 
    }
    
    public static void main(String[] args) {
        String str = scn.nextLine();
        pattern_string(str);
    }
}

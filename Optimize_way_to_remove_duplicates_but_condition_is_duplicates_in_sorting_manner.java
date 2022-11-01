import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String removeAllDuplicates_02(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        sb.append(str.charAt(0));
        int i = 1, itr = 0;
        while (i < n) {
            while (i < n && sb.charAt(itr) == str.charAt(i)) {
                i++;
            }
            if (i < n) {
                sb.append(str.charAt(i));
                i++;
                itr++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(removeAllDuplicates_02(str));
    }
}
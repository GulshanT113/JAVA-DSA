import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String compress_02(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        sb.append(str.charAt(0));
        int i = 1;
        while (i < n) {
            int count = 1;
            while (i < n && sb.charAt(sb.length() - 1) == str.charAt(i)) {
                i++;
                count++;
            }
            if (count > 1) {
                sb.append(count);
            }
            if (i < n) {
                sb.append(str.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println("Please enter duplicate or string in sorting manner.");
        String str = scn.nextLine();
        System.out.println(compress_02(str));
    }
}
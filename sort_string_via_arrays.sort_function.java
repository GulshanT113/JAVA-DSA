import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static String string_sorting(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(string_sorting(str));
    }
}
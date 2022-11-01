import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String revString(String str){
        str = str.replaceAll("( )+", " ");
        int n = str.length();
        String rts = "";
        for(int i = n-1; i >= 0; i--){
            rts += str.charAt(i);
        }
        return rts;
    }    
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(revString(str));
    }
}
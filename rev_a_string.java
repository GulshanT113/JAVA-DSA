import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String n = scn.nextLine();
        String rev = "";
        for(int i = n.length()-1; i >= 0; i--){
            rev = rev + n.charAt(i);
        }
        System.out.println(rev);
    }
}
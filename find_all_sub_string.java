import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        //int len = s.length();
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                System.out.println(s.substring(i, j+1));
            }
            System.out.println();
        }
    }
}

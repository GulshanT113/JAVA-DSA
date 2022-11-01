import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        String s = scn.nextLine();
        int c = 0;
        int c_2 = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            c++;
            else if(ch >= 'A' && ch <= 'Z')
            c_2++;
            else
            System.out.printf("invalid input:");
            
        }
        System.out.println(c);
        System.out.println(c_2);
    }
}

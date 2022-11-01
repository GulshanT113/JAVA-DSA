import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        String s = scn.nextLine();
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch >= 'a' && ch <= 'z')
            ans += (char)(ch - 'a' + 'A');
            
            else if(ch >= 'A' && ch <= 'Z')
            ans += (char)(ch - 'A' + 'a');
            
            else
            System.out.printf("invalid input:");
            
        }
        System.out.println(ans);
    }
}

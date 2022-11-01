import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String print_toggle_case(){
        String a = scn.nextLine();
        String b = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
                b += (char)(a.charAt(i)-'A'+'a');
            }
            else if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                b += (char)(a.charAt(i)-'a'+'A');
            }
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(print_toggle_case());
    }
}
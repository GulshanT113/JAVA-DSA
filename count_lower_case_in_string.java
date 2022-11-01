import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int count_lower_case(){
        String a = scn.nextLine();
        int c = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args){
        System.out.println(count_lower_case());
    }
}
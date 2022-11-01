import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a String");
        String s = scn.nextLine();
        System.out.println("enter a char would you like to count");
        char ch = scn.next().charAt(0);
        int c=0;
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==ch){
                c++;
                ans = ans+ch;
            }
        }
        System.out.println("the count is = " + c);
        System.out.println("the string would you input, the result is here = " + ans);
    }
}

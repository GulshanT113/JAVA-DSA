import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String n = scn.nextLine();
        int c = 0;
        for(int i = n.length()-1; i >= 0; i--){
            if(n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u' || 
            n.charAt(i) == 'A' || n.charAt(i) == 'E' || n.charAt(i) == 'I' || n.charAt(i) == 'O' || n.charAt(i) == 'U')
            c++;
        }
        System.out.println(c);
    }
}
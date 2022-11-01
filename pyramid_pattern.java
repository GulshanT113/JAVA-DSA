import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern(int n){
        for (int r = 1; r <= n; r++) { 
            for (int i = 1; i <= n-r; i++) { 
                System.out.print(" "); 
            } 
            for (int i = 1; i <= r; i++) { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        }
    }
    public static void main(String[] args){
        pattern(scn.nextInt());
    }
}
import java.util.*;
public class Main
{ 
    public static Scanner scn = new Scanner(System.in);
    public static void pattern_1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i+j==n-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        pattern_1(n);
    }
}

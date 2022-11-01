import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern_11(int n){
        int nsp = 0;
        int nst = (n*2)-1;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print("  ");
            }
            for(int cst = 1; cst <= nst; cst++){
                System.out.print("* ");
            }
            nst -=2;
            nsp ++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = scn.nextInt();          
        pattern_11(n);
    }
}

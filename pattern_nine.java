import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void print_pattern(int n){
        int nst = 1; 
        int nst_2 = 1;
        int nsp = n-1;
        int nsp_2 = n-1;
        
        for(int r = 1; r <= n; r++){
            for(int cst = 1; cst <= nst; cst++){
                System.out.print("*");
            }
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print(" ");
            }
                
            
            for(int csp = 1; csp <= nsp_2; csp++){
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst_2; cst++){
                System.out.print("*");
            }
            nst++;
            nst_2++;
            nsp--;
            nsp_2--;
            
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        print_pattern(n);
    }
}

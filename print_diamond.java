import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern_11(int n){
        int nst = 1;
        int nsp = n-1;
        for(int r = 1; r < n*2; r++){
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print(" ");
            }
            for(int cst = 1; cst <= nst; cst++){
                System.out.print("*");
            }
            if(r<n){
                nst += 2;
                nsp --;
            }
            else{
                nsp ++;
                nst -= 2;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = scn.nextInt();          
        pattern_11(n);
    }
}



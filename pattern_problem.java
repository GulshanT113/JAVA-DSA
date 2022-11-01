import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void Print_pattern(int n){
        int nst = (n/2)+1;
        int nst_1 = (n/2)+1;
        int nsp = 1;
        for(int r = 1; r <= n; r++){
            for(int i = 1; i <= nst_1; i++){
                System.out.print("*");
            }
            for(int j = 1; j <= nsp; j++){
                System.out.print(" ");
            }
            
             for(int k = 1; k <= nst_1; k++){
                System.out.print("*");
            }
            if(r < nst){
               nsp += 2;
               nst_1--;
            }
            else {
               nsp -= 2; 
               nst_1++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        Print_pattern(n);
    }
}


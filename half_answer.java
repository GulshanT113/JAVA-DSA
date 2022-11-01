import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void Print_pattern(int n){
        int nst = (n/2)+1;
        int nst_1 = (n/2)+1;
        for(int r = 1; r <= n; r++){
            for(int i = 1; i <= nst_1; i++){
                System.out.print("*");
            }
            if(r < nst){
               nst_1--;
            }
            else {
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


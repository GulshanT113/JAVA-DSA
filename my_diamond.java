import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern(int n){
        int star = 1, space = n-1;
        for(int r = 1; r < n*n; r++){
            for(int i = 1; i <= space; i++){
                System.out.print("  ");
            }
            for(int i = 1; i <= star; i++){
                System.out.print("* ");
            }
            if(r < n){
                star += 2;
                space--;
            }
            else{
                star -=2;
                space++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(scn.nextInt());
    }
}
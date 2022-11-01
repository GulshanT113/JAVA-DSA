import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern(int n){
        int star = n/2+1, space = 1;
        for(int r = 1; r <= n; r++){
            for(int i = 1; i <= star; i++){
                System.out.print("* ");
            }
            for(int i = 1; i <= space; i++){
                System.out.print("  ");
            }
            for(int i = 1; i <= star; i++){
                System.out.print("* ");
            }
            if(r <= n/2){
                star--;
                space += 2;
            }
            else{
                star++;
                space -= 2;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(scn.nextInt());
    }
}
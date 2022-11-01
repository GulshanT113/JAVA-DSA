import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void pattern(int n){
        int star = 1;
        for(int r = 1; r <= n; r++){
            for(int i = 1; i <= star; i++){
                System.out.print("* ");
            }
            star++;
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(scn.nextInt());
    }
}
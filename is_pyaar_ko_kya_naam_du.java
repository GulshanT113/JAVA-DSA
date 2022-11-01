import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void digit(int n){
        int i = 2;
        while(n > 1){
            while(n%i == 0){
                System.out.print(i + " ");
                n/=i;
            }
            i++;
        }
    }
    public static void main(String[] args){
        digit(scn.nextInt());
    }
}
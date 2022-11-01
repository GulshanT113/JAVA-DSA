import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean PalinDrome(int n){
        if(n == 0)
            return true;
        int sum = 0, r;
        int temp = n;
        while(n > 0){
            r = n % 10;
            System.out.println("this is for 'REM' = " + r);
            sum = (sum*10) + r;
            System.out.println("this is for 'SUM' = " + sum);
            n /= 10;
            System.out.println("this is for N's DIVISION = " + n);
        }
        if(temp == sum)
        return true;
        else
        return false;
    }
    public static void main(String[] args){
        System.out.println(PalinDrome(scn.nextInt()));
    }
}
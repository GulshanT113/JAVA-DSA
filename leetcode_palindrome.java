import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean SolveDigit(int n){
        if(n == 0)
            return true;
        int sum = 0, r;
        int temp = n;
        while(n > 0){
            r = n % 10;
            sum = (sum*10) + r;
            n /= 10;
        }
        if(temp == sum)
        return true;
        else
        return false;
    }
    public static void main(String[] args){
        System.out.println(SolveDigit(scn.nextInt()));
    }
}
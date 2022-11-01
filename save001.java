import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean IsPrime(int n){
        int c = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
            c++;
        }
        if(c == 2)
        return true;
        else
        return false;
    }
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(IsPrime(i))
            System.out.print(i + " ");
        }
    }
}

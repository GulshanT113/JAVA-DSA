import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static boolean optimize_prime(int n){
        for(int i = 2; i*i < n; i++){
            if(n % i == 0)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(optimize_prime(scn.nextInt()));
    }
}
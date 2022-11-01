import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static boolean Palindrome(int n){
        int m = n;
        int sum = 0;
        while(m > 0){
            int rem = m%10;
            System.out.println(rem);
            sum = rem + (sum*10);
            System.out.println(sum);
            m /= 10;
            System.out.println(m);
        }
        if(sum == n)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        // System.out.println(Palindrome(scn.nextInt()));
        System.out.println(isPrime(scn.nextInt()));
    }
}
import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static int primePalindrome(int n) {
        while (true) {
            if (isPrime(n) && isPalindrome(n)) {
                return n;
            }
            n++;
        }       
    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(primePalindrome(scn.nextInt()));
    }
}
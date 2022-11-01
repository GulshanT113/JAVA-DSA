import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int power(int a, int n){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= a;
            System.out.println(ans);
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println("enter a input:");
        int a = scn.nextInt();
        System.out.println("enter a range:");
        int n = scn.nextInt();
        System.out.println("the respected output start from here:");
        power(a, n);
    }
}
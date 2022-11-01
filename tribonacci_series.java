import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int fib(int n){
        if(n == 0)
        return 0;
        int sum = 1;
        int a = 0, b = 1, c = 1;
        for(int i = 2; i < n; ++i){    
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(fib(scn.nextInt()));
    }
}    
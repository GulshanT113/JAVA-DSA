import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    
    public static void print_fibonacci(int n) {
        System.out.println("enter the number :");
        int a = 0;
        int b = 1;
        int sum;
        for(int i = a; i <= n; i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(a + " ");
        }
    }    
        
    public static void main(String[] args){
        int n = scn.nextInt();
        print_fibonacci(n);
    }

}
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int GCD(int a, int b){
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(b % a != 0){
            int rem = b%a;
            b = a;
            a = rem;
        }
        return a;
    }
    public static void main(String[] args){
        int a = scn.nextInt();
        int b = scn.nextInt();
        //GCD(a, b);
        System.out.println(GCD(a, b));
    }
    

}
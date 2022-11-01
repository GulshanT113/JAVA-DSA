import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int LCM(int a, int b){
        int fetch = GCD(a, b);
        return (a/fetch)*b;
    }
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
        System.out.println(LCM(a, b));
    }
    

}
import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static int power(int a, int b){
        int ans = 1;
        for(int i = 1; i <= b; i++){
            ans *= a;
        }
        return ans;
    }
    public static int fect(int n){
        int ans = 1;
        while(n>0){
            ans *= n --;     
        }
        return ans;
    }
    
    public static int NCR(int n, int r){
        int a = fect(n);
        int b = fect(n-r);
        int c = fect(r);
        return a/(b*c);
    }
    
    public static int NPR(int n, int r){
        int a = fect(n);
        int b = fect(n-r);
        return a/b;
    }
    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("power of a given number = " + power(a, b));
        
        int n = scn.nextInt();
        System.out.println("fectorial of a given number = " + fect(n));
        
        n = scn.nextInt();
        int r = scn.nextInt();
        System.out.println("NCR is here = " + NCR(n, r));
        
        n = scn.nextInt();
        r = scn.nextInt();
        System.out.println("NPR is here = " + NPR(n, r));
    }
}

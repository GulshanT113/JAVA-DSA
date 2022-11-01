import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    
    public static int fect(int num){
        int ans = 1;
        while(num>0){
            ans *= num --;
        }
        return ans;
    }

    public static int ncr(int n, int r){
        int a = fect(n);
        int b = fect(n-r);
        int c = fect(r);
        return a/(b*c);
    }
    
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        int r = scn.nextInt();
        int ans = ncr(n, r);
        System.out.println(ans);
    }
}

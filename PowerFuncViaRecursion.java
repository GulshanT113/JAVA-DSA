import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int func(int x, int n){
        if(n == 1) return x;
        int f = func(x, n-1);
        int ans = f * x;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(func(scn.nextInt(), scn.nextInt()));
    }
}

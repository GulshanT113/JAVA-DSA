import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static int power(int a, int n){
        for(int i = 1; i < n; i++){
            int b;
            b = a*a;
            a = b*a;
            System.out.println(a);
        }
        return -1;
    }
    public static void main(String[] args) {
        int a = scn.nextInt();
        int n = scn.nextInt();
        power(a, n);
    }
}

import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static int power(int n){
        int ans = 1;
        while(n>0){
            ans *= n --;
             
        }
        System.out.print(ans);
       
        return -1;
    }
    public static void main(String[] args) {
        //int a = scn.nextInt();
        int n = scn.nextInt();
        power(n);
    }
}

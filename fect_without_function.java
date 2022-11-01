import java.util.*;
public class Main
{
    public static void main(String[] args) {
        //int a = scn.nextInt();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 1;
        while(n>0){
            ans *= n --;
        }
        System.out.print(ans);
    }
}

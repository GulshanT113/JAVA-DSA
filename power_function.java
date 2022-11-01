import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int power(int digit, int pwr){
        int ans = 1;
        for(int i = 1; i <= pwr; i++){
            ans *= digit;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(power(scn.nextInt(),scn.nextInt()));
    }
}
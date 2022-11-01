import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int power(int digit, int pwr){
        int ans = 1;
        while(pwr > 0){
            if(pwr%2 == 1){
                ans*=digit;
                pwr--;
            }
            else{
                digit*=digit;
                pwr /= 2;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(power(scn.nextInt(),scn.nextInt()));
    }
}
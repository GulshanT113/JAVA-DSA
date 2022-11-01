import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int SolveDigit(int n){
        if(n == 0)
            return 0;
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        int rSum = 0;
        while(sum > 0){
            rSum += sum%10;
            sum /= 10;
        }
        int asum = 0;
        while(rSum > 0){
            asum += rSum%10;
            rSum /= 10;
        }
        return asum;
    }
    public static void main(String[] args){
        System.out.println(SolveDigit(scn.nextInt()));
    }
}
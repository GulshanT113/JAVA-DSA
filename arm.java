import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int digit_count(int num){
        int c = 0;
        while(num != 0){
            num /= 10;
            c++;
        }
        return c;
    }
    public static int arm_st_num(int n){
        //int n = scn.nextInt();
        int digit_count = digit_count(n);
        int res = 0;
        int num = n;
        while(n!=0){
            int rem = num % 10;
            num /= 10;
            res += Math.pow(rem, digit_count);
        }
        return res;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        arm_st_num(n);
    }
    
}
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int BinaryToDecimal(String str){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = n-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        int ans = 0;
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '1'){
                ans += power(2, i);
            }
        }
        return ans;
    }
    public static int power(int digit, int pwr){
        int ans = 1;
        for(int i = 1; i <= pwr; i++){
            ans *= digit;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(BinaryToDecimal(scn.nextLine()));
    }
}
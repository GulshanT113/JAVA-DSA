import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void sum_of_half(String str){
        int n = str.length();
        int mid = (0 + n - 1) / 2;
        int i = n % 2 == 0 ? mid : mid - 1;
        int j = mid + 1;
        int sum_1 = 0, sum_2 = 0;
        while (i >= 0) {
            char ch_1 = str.charAt(i--);
            char ch_2 = str.charAt(j++);
            // convert char into digit
            int d_1 = ch_1 - '0';
            int d_2 = ch_2 - '0';
            // add up as a digit
            sum_1 += d_1;
            sum_2 += d_2;
        }
        if (n % 2 != 0) {
            sum_1 += str.charAt(mid) - '0';
            sum_2 += str.charAt(mid) - '0';
        }
        if(sum_1 == sum_2)
        System.out.println("true");
        else
        System.out.println("false");
    }    
    public static void main(String[] args){
        String str = scn.nextLine();
        sum_of_half(str);
    }
}
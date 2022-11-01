import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int sum_of_all_substring(String num){
        int n = num.length();
        int sum_of_digit[] = new int[n];
        sum_of_digit[0] = num.charAt(0) - '0';
        int res = sum_of_digit[0];
        for (int i = 1; i < n; i++) {
            int num_i = num.charAt(i) - '0';
            sum_of_digit[i] = (i + 1) * num_i + 10 * sum_of_digit[i - 1];
            res += sum_of_digit[i];
            System.out.println("this is for " + i + " count");
            System.out.println(sum_of_digit[i]);
            System.out.println("this is for result count--->");
            System.out.println(res);
        }
        return res;
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println("this is final result for substring count ---> '" + sum_of_all_substring(str) + "'");
    }
}
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String deci_to_binary(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append(n%2);
            n /= 2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(deci_to_binary(scn.nextInt()));
    }
}    
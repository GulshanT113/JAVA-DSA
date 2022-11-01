import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = 0;
        while(n != 0) {
            int digit = n % 10;
            m = m * 10 + digit;
            n /= 10;
        }
        int c = 0;
        for(int i = 2; i < n/2+1; i++){
            if(n % i == 0)
                c++;
        }
        for(int i = 2; i < m/2+1; i++){
            if(m % i == 0)
                c++;
        }
        if(c != 0)
            System.out.println("FALSE");
        else
            System.out.println("TRUE");
    }
}
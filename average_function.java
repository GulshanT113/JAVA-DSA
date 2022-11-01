import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int avg_value(int n){
        int c = 0, total = 0;
        while(c < n){
            int value = scn.nextInt();
            total += value;
            c++;
        }
        int avg = total/n;
        return avg;
    }
    public static void main(String[] args){
        System.out.println(avg_value(scn.nextInt()));
    }
}
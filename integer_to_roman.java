import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void int_to_roman(int n){
        int a = 1, b = 5;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.println(a);
                a*=10;
            }
            else{
                System.out.println(b);
                b*=10;
            }
        }
    }
    public static void main(String[] args){
        int_to_roman(scn.nextInt());
    }
}
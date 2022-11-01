import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void func(int n){
        if(n == 0) return;
        System.out.println(n);
        func(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        func(scn.nextInt());
    }
}

import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int abs_Value(int n){
        if(n >= 0)
        return n;
        else
        return -n;
    }
    public static void main(String[] args){
        System.out.println(abs_Value(scn.nextInt()));
    }
}
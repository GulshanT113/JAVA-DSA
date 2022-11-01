import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input1D(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
        return arr;
    }
    public static void func(int n){
        if(n <= 1) {
            System.out.println("base " + n);
            return;
        }
        System.out.println("pre " + n);
        func(n-1);
        System.out.println("in " + n);
        func(n-2);
        System.out.println("post " + n);
    }    
    public static void main(String[] args) {
        func(5);
    }
}


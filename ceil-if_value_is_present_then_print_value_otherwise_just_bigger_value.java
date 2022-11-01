import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input_1D(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int ceil_pro(int[] arr, int n){
        int flr = Integer.MAX_VALUE;
        for(int i : arr){
            if (i >= n)
            flr = Math.min(i, flr);
        }
        return flr;
    }
    public static void main(String[] args){
        int[] arr = input_1D();
        System.out.println(min_value(arr, scn.nextInt()));
    }
}
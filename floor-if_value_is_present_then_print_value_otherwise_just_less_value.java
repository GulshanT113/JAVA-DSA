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
    public static int floor_bhai(int[] arr, int n){
        int flr = Integer.MIN_VALUE;
        for(int i : arr){
            if (i <= n)
            flr = Math.max(i, flr);
        }
        return flr;
    }
    public static void main(String[] args){
        int[] arr = input_1D();
        System.out.println(floor_bhai(arr, scn.nextInt()));
    }
}
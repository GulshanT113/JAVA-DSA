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
    public static int Min_Value(int a, int b){
        return a < b ? a : b;
    }
    public static int Min_Value(int[] arr){
        int min = arr[0];
        for(int i : arr){
            if(i < min)
            min = i;
        }
        return min;
    }
    public static void main(String[] args){
        // System.out.println(Min_Value(scn.nextInt(), scn.nextInt()));
        int[] arr = input_1D();
        System.out.println(Min_Value(arr));
    }
}
import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input1D(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static void print1D(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] convert(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            ans[arr[i]] = i;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = input1D();
        print1D(convert(arr));
    }
}

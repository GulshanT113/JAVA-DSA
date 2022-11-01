import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input1D(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
        return arr;
    }
    public static void print1D(int[] arr){
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
    public static int[] Func(int[] arr, int x, int i, int c){
        if(i == arr.length){
            int[] ans = new int[c];
            return ans;
        }
        if(arr[i] == x) c++;
        int[] ans = Func(arr, x, i+1, c);
        if(arr[i] == x){
            int k = c - 1;
            ans[k] = i;
        }    
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = input1D();
        print1D(Func(arr, scn.nextInt(), 0, 0));
    }
}